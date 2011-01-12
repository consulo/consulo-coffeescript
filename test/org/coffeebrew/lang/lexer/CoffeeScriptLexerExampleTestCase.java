package org.coffeebrew.lang.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.*;
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
 * The Ant target 'generate-tokes' will then pass these example to the CoffeeScript
 * compiler and stores the generated lexer token output to /target/coffee-script
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
class CoffeeScriptLexerExampleTestCase {

  private static final String NL = System.getProperty("line.separator");
  private static final String FS = System.getProperty("file.separator");

  private enum FileType { TOKENS, COFFEE }

  /**
   * Assert that the CoffeeScript tokens from the original lexer
   *
   * @param example The name of the example
   */
  protected void assertLexerExample(String example) {
    try {
      assertThat(getExpectedTokens(example), equalTo(getGeneratedTokens(example)));

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
  private static Collection<CoffeeScriptLexerTestToken> getGeneratedTokens(String example) throws FileNotFoundException, IOException {
    ArrayList<CoffeeScriptLexerTestToken> tokens = new ArrayList<CoffeeScriptLexerTestToken>();
    StringBuffer content = readFile(example, FileType.TOKENS);

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
  private static Collection<CoffeeScriptLexerTestToken> getExpectedTokens(String example) throws FileNotFoundException, IOException {

    final FlexAdapter lexer = new CoffeeScriptFlexLexer();
    lexer.start(readFile(example, FileType.COFFEE));

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
   * @param example
   * @param type
   * @return
   * @throws FileNotFoundException
   * @throws IOException
   */
  private static StringBuffer readFile(String example, FileType type) throws FileNotFoundException, IOException {
    BufferedReader reader = new BufferedReader(new FileReader(getExampleFilePath(example, type)));
    StringBuffer buffer = new StringBuffer();
    String line = "";

    while ((line = reader.readLine()) != null) {
      buffer.append(line + NL);
    }

    return buffer;
  }

  /**
   * Returns the path and filename to the example file for the given type
   *
   * @param example
   * @param type
   * @return
   */
  private static String getExampleFilePath(String example, FileType type) {
    String filename;
    String basepath = getProjectHome() + FS + "resources" + FS + "coffee-script" + FS + "examples" + FS;

    if (type == FileType.COFFEE) {
      filename = basepath + example + ".coffee";
    } else {
      filename = basepath + example + ".tokens";
    }

    return filename;
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
