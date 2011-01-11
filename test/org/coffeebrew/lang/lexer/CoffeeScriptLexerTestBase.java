package org.coffeebrew.lang.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * The lexer is tested by comparing the lexer tokens from the original CoffeeScript lexer
 * to the tokens generated by CoffeeScriptFlexLexer.
 * <p/>
 * Examples should be placed as plain CoffeeScript files under /resources/coffee-script
 * <p/>
 * The Ant target 'generate-tokes' will then pass these examples to the CoffeeScript
 * compiler and stores the generated lexer token output to /target/coffee-script
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
class CoffeeScriptLexerTestBase {

  /**
   * Assert that the CoffeeScript tokens from the original lexer
   *
   * @param example The name of the example
   */
  protected void assertLexerExample(String example) {
    try {
      assertThat(getOriginalTokens(example), equalTo(getPluginTokens(example)));

    } catch (FileNotFoundException e) {
      fail("File not found: " + e.getMessage());
    } catch (IOException e) {
      fail("Cannot read file: " + e.getMessage());
    }
  }

  /**
   * Uses generated tokens from CoffeeScript
   *
   * @param example The example file name
   * @return the lexer tokens
   */
  private static Collection<CoffeeScriptLexerTestToken> getOriginalTokens(String example) throws FileNotFoundException, IOException {
    ArrayList<CoffeeScriptLexerTestToken> tokens = new ArrayList<CoffeeScriptLexerTestToken>();
    StringBuffer content = readFile("/target/coffee-script/", example, "tokens");

    Pattern pattern = Pattern.compile("(\\[.*?\\])+", Pattern.MULTILINE);
    Matcher matcher = pattern.matcher(content);

    while (matcher.find()) {
      CoffeeScriptLexerTestToken token = new CoffeeScriptLexerTestToken(content.substring(matcher.start(), matcher.end()));
      tokens.add(token);
    }

    return tokens;
  }

  /**
   * Uses the plugin to generate the lexer tokens for the given filename
   *
   * @param example The example file name
   * @return the lexer tokens
   */
  private static Collection<CoffeeScriptLexerTestToken> getPluginTokens(String example) throws FileNotFoundException, IOException {

    final FlexAdapter lexer = new CoffeeScriptFlexLexer();
    lexer.start(readFile("/resources/coffee-script/", example, "coffee"));

    ArrayList<CoffeeScriptLexerTestToken> tokens = new ArrayList<CoffeeScriptLexerTestToken>();
    while (lexer.getCurrentPosition().getOffset() < lexer.getBufferEnd()) {
      CoffeeScriptLexerTestToken token = new CoffeeScriptLexerTestToken(lexer.getTokenType(), lexer.getTokenSequence());
      tokens.add(token);
      lexer.advance();
    }

    return tokens;
  }

  /**
   * Reads the given file and returns its content as StringBuffer
   *
   * @param prefix
   * @param filename
   * @param extension
   * @return
   * @throws FileNotFoundException
   * @throws IOException
   */
  private static StringBuffer readFile(String prefix, String filename, String extension) throws FileNotFoundException, IOException {
    BufferedReader reader = new BufferedReader(new FileReader(getProjectHome() + prefix + filename + "." + extension));
    StringBuffer buffer = new StringBuffer();
    String line = "";

    while ((line = reader.readLine()) != null) {
      buffer.append(line);
    }

    return buffer;
  }

  /**
   * Returns the project home directory
   *
   * @return
   */
  private static String getProjectHome() {
    Properties props = System.getProperties();
    return props.getProperty("user.dir");
  }

}
