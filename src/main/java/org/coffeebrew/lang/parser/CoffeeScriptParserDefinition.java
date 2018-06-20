package org.coffeebrew.lang.parser;

import javax.annotation.Nonnull;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import consulo.lang.LanguageVersion;
import org.coffeebrew.CoffeeScriptLanguage;
import org.coffeebrew.lang.lexer.CoffeeScriptFlexLexer;
import org.coffeebrew.lang.lexer.CoffeeScriptTokenSets;
import org.coffeebrew.lang.psi.CoffeeScriptFile;
import org.coffeebrew.lang.psi.impl.CoffeeScriptElementImpl;

public class CoffeeScriptParserDefinition implements ParserDefinition {

  private static final IFileElementType FILE_ELEMENT_TYPE = new IFileElementType(CoffeeScriptLanguage.INSTANCE);

  @Override
  @Nonnull
  public Lexer createLexer(@Nonnull LanguageVersion languageVersion) {
    return new CoffeeScriptFlexLexer();
  }

  @Nonnull
  @Override
  public PsiParser createParser(@Nonnull LanguageVersion languageVersion) {
    return new CoffeeScriptParser();
  }

  @Nonnull
  @Override
  public IFileElementType getFileNodeType() {
    return FILE_ELEMENT_TYPE;
  }

  @Override
  @Nonnull
  public TokenSet getWhitespaceTokens(@Nonnull LanguageVersion languageVersion) {
    return CoffeeScriptTokenSets.WHITESPACE_TOKEN_SET;
  }

  @Override
  @Nonnull
  public TokenSet getCommentTokens(@Nonnull LanguageVersion languageVersion) {
    return CoffeeScriptTokenSets.COMMENTS_TOKEN_SET;
  }

  @Override
  @Nonnull
  public TokenSet getStringLiteralElements(@Nonnull LanguageVersion languageVersion) {
    return CoffeeScriptTokenSets.STRING_TOKEN_SET;
  }

  @Override
  @Nonnull
  public PsiElement createElement(ASTNode node) {
    return new CoffeeScriptElementImpl(node);
  }

  @Override
  public PsiFile createFile(FileViewProvider viewProvider) {
    return new CoffeeScriptFile(viewProvider);
  }

  @Override
  public ParserDefinition.SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
    return ParserDefinition.SpaceRequirements.MAY;
  }

}
