package org.coffeebrew.lang.lexer;

import com.intellij.psi.tree.TokenSet;

/**
 * Group the lexer lexer
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
public interface CoffeeScriptTokenSets extends CoffeeScriptTokenTypes {

  TokenSet WHITESPACE_TOKEN_SET = TokenSet.create(
          WHITE_SPACE
  );

  TokenSet COMMENTS_TOKEN_SET = TokenSet.create(
          LINE_COMMENT,
          BLOCK_COMMENT
  );

  TokenSet STRING_TOKEN_SET = TokenSet.create(
          STRING,
          STRING_LITERAL
  );

}
