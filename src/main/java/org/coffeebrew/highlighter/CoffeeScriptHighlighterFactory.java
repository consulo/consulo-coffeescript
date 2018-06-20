package org.coffeebrew.highlighter;

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import javax.annotation.Nonnull;

/**
 * CoffeeScript Syntax highlighter factory
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
public class CoffeeScriptHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {

  @Nonnull
  protected CoffeeScriptSyntaxHighlighter createHighlighter() {
    return new CoffeeScriptSyntaxHighlighter();
  }

}
