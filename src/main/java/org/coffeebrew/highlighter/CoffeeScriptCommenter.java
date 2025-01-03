package org.coffeebrew.highlighter;

import consulo.annotation.component.ExtensionImpl;
import consulo.language.CodeDocumentationAwareCommenter;
import consulo.language.Language;
import consulo.language.ast.IElementType;
import consulo.language.psi.PsiComment;
import org.coffeebrew.CoffeeScriptLanguage;
import org.coffeebrew.lang.lexer.CoffeeScriptTokenTypes;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * Commenting and uncommenting of CoffeeScript code blocks
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
@ExtensionImpl
public class CoffeeScriptCommenter implements CodeDocumentationAwareCommenter {

  public String getLineCommentPrefix() {
    return "#";
  }

  public String getBlockCommentPrefix() {
    return "###";
  }

  public String getBlockCommentSuffix() {
    return "###";
  }

  public String getCommentedBlockCommentPrefix() {
    return null;
  }

  public String getCommentedBlockCommentSuffix() {
    return null;
  }

  @Nullable
  public IElementType getLineCommentTokenType() {
    return CoffeeScriptTokenTypes.LINE_COMMENT;
  }

  @Nullable
  public IElementType getBlockCommentTokenType() {
    return CoffeeScriptTokenTypes.BLOCK_COMMENT;
  }

  @Nullable
  public IElementType getDocumentationCommentTokenType() {
    return null;
  }

  @Nullable
  public String getDocumentationCommentPrefix() {
    return null;
  }

  @Nullable
  public String getDocumentationCommentLinePrefix() {
    return null;
  }

  @Nullable
  public String getDocumentationCommentSuffix() {
    return null;
  }

  public boolean isDocumentationComment(PsiComment element) {
    return false;
  }

  @Nonnull
  @Override
  public Language getLanguage() {
    return CoffeeScriptLanguage.INSTANCE;
  }
}
