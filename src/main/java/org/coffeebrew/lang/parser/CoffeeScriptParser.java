package org.coffeebrew.lang.parser;

import consulo.language.ast.ASTNode;
import consulo.language.ast.IElementType;
import consulo.language.parser.PsiBuilder;
import consulo.language.parser.PsiParser;
import consulo.language.version.LanguageVersion;

import jakarta.annotation.Nonnull;

/**
 * Parser implementation for CoffeeScript language support
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
public class CoffeeScriptParser implements PsiParser {

  @Nonnull
  public ASTNode parse(IElementType root, PsiBuilder builder, LanguageVersion languageVersion) {
    final PsiBuilder.Marker rootMarker = builder.mark();

    while (!builder.eof()) {
      IElementType token = builder.getTokenType();

      if (token != null) {
        builder.mark().done(token);
      }

      builder.advanceLexer();
    }

    rootMarker.done(root);
    return builder.getTreeBuilt();
  }

}
