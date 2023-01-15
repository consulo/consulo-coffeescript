package org.coffeebrew.highlighter;

import consulo.annotation.component.ExtensionImpl;
import consulo.language.Language;
import consulo.language.editor.highlight.SingleLazyInstanceSyntaxHighlighterFactory;
import org.coffeebrew.CoffeeScriptLanguage;

import javax.annotation.Nonnull;

/**
 * CoffeeScript Syntax highlighter factory
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
@ExtensionImpl
public class CoffeeScriptHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {

  @Nonnull
  protected CoffeeScriptSyntaxHighlighter createHighlighter() {
    return new CoffeeScriptSyntaxHighlighter();
  }

  @Nonnull
  @Override
  public Language getLanguage() {
    return CoffeeScriptLanguage.INSTANCE;
  }
}
