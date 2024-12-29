package org.coffeebrew.highlighter;

import consulo.annotation.component.ExtensionImpl;
import consulo.language.BracePair;
import consulo.language.Language;
import consulo.language.PairedBraceMatcher;
import org.coffeebrew.CoffeeScriptLanguage;
import org.coffeebrew.lang.lexer.CoffeeScriptTokenTypes;

import jakarta.annotation.Nonnull;

/**
 * Brace matcher for the CoffeeScript language
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
@ExtensionImpl
public class CoffeeScriptBraceMatcher implements PairedBraceMatcher {

  private static final BracePair[] PAIRS = {
          new BracePair(CoffeeScriptTokenTypes.PARENTHESIS_START, CoffeeScriptTokenTypes.PARENTHESIS_END, false),
          new BracePair(CoffeeScriptTokenTypes.BRACKET_START, CoffeeScriptTokenTypes.BRACKET_END, false),
          new BracePair(CoffeeScriptTokenTypes.BRACE_START, CoffeeScriptTokenTypes.BRACE_END, false),
          new BracePair(CoffeeScriptTokenTypes.REGEX_START, CoffeeScriptTokenTypes.REGEX_END, false),
          new BracePair(CoffeeScriptTokenTypes.REGEX_BRACKET_START, CoffeeScriptTokenTypes.REGEX_BRACKET_END, false),
          new BracePair(CoffeeScriptTokenTypes.REGEX_PARENTHESIS_START, CoffeeScriptTokenTypes.REGEX_PARENTHESIS_END, false),
          new BracePair(CoffeeScriptTokenTypes.REGEX_BRACE_START, CoffeeScriptTokenTypes.REGEX_BRACE_END, true),
          new BracePair(CoffeeScriptTokenTypes.INTERPOLATION_START, CoffeeScriptTokenTypes.INTERPOLATION_END, true),
  };

  public BracePair[] getPairs() {
    return PAIRS;
  }

  @Nonnull
  @Override
  public Language getLanguage() {
    return CoffeeScriptLanguage.INSTANCE;
  }
}
