package org.coffeebrew.lang.parser;

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
import org.jetbrains.annotations.NotNull;

public class CoffeeScriptParserDefinition implements ParserDefinition {

  private static final IFileElementType FILE_ELEMENT_TYPE = new IFileElementType(CoffeeScriptLanguage.INSTANCE);

  @Override
  @NotNull
  public Lexer createLexer(@NotNull LanguageVersion languageVersion) {
    return new CoffeeScriptFlexLexer();
  }

  @NotNull
  @Override
  public PsiParser createParser(@NotNull LanguageVersion languageVersion) {
    return new CoffeeScriptParser();
  }

  @NotNull
  @Override
  public IFileElementType getFileNodeType() {
    return FILE_ELEMENT_TYPE;
  }

  @Override
  @NotNull
  public TokenSet getWhitespaceTokens(@NotNull LanguageVersion languageVersion) {
    return CoffeeScriptTokenSets.WHITESPACE_TOKEN_SET;
  }

  @Override
  @NotNull
  public TokenSet getCommentTokens(@NotNull LanguageVersion languageVersion) {
    return CoffeeScriptTokenSets.COMMENTS_TOKEN_SET;
  }

  @Override
  @NotNull
  public TokenSet getStringLiteralElements(@NotNull LanguageVersion languageVersion) {
    return CoffeeScriptTokenSets.STRING_TOKEN_SET;
  }

  @Override
  @NotNull
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
