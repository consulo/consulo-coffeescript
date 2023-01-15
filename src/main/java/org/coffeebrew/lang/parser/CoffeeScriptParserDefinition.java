package org.coffeebrew.lang.parser;

import consulo.annotation.component.ExtensionImpl;
import consulo.language.Language;
import consulo.language.ast.ASTNode;
import consulo.language.ast.IFileElementType;
import consulo.language.ast.TokenSet;
import consulo.language.file.FileViewProvider;
import consulo.language.lexer.Lexer;
import consulo.language.parser.ParserDefinition;
import consulo.language.parser.PsiParser;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.language.version.LanguageVersion;
import org.coffeebrew.CoffeeScriptLanguage;
import org.coffeebrew.lang.lexer.CoffeeScriptFlexLexer;
import org.coffeebrew.lang.lexer.CoffeeScriptTokenSets;
import org.coffeebrew.lang.psi.CoffeeScriptFile;
import org.coffeebrew.lang.psi.impl.CoffeeScriptElementImpl;

import javax.annotation.Nonnull;

@ExtensionImpl
public class CoffeeScriptParserDefinition implements ParserDefinition {

  private static final IFileElementType FILE_ELEMENT_TYPE = new IFileElementType(CoffeeScriptLanguage.INSTANCE);

  @Nonnull
  @Override
  public Language getLanguage() {
    return CoffeeScriptLanguage.INSTANCE;
  }

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
