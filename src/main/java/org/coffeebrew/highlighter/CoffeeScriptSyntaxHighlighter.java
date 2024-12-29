package org.coffeebrew.highlighter;

import consulo.codeEditor.DefaultLanguageHighlighterColors;
import consulo.codeEditor.HighlighterColors;
import consulo.colorScheme.TextAttributesKey;
import consulo.language.ast.IElementType;
import consulo.language.editor.highlight.SyntaxHighlighterBase;
import consulo.language.lexer.Lexer;
import org.coffeebrew.lang.lexer.CoffeeScriptFlexLexer;
import org.coffeebrew.lang.lexer.CoffeeScriptTokenTypes;

import jakarta.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

/**
 * CoffeeScript syntax highlighter
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
public class CoffeeScriptSyntaxHighlighter extends SyntaxHighlighterBase {

  private static final Map<IElementType, TextAttributesKey> TOKENS_TO_STYLES;

  @Nonnull
  public Lexer getHighlightingLexer() {
    return new CoffeeScriptFlexLexer();
  }

  static final TextAttributesKey BAD_CHARACTER = TextAttributesKey.createTextAttributesKey(
    "COFFEESCRIPT.BAD_CHARACTER",
    HighlighterColors.BAD_CHARACTER
  );

  static final TextAttributesKey SEMICOLON = TextAttributesKey.createTextAttributesKey(
    "COFFEESCRIPT.SEMICOLON",
    DefaultLanguageHighlighterColors.SEMICOLON
  );

  static final TextAttributesKey COMMA = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.COMMA",
          DefaultLanguageHighlighterColors.COMMA
  );

  static final TextAttributesKey DOT = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.DOT",
          DefaultLanguageHighlighterColors.DOT
  );

  static final TextAttributesKey CLASS_NAME = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.CLASS_NAME",
          HighlighterColors.TEXT
  );

  static final TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.IDENTIFIER",
          HighlighterColors.TEXT
  );

  static final TextAttributesKey CONSTANT = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.CONSTANT",
          HighlighterColors.TEXT
  );

  static final TextAttributesKey FUNCTION_NAME = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.FUNCTION_NAME",
		  DefaultLanguageHighlighterColors.FUNCTION_DECLARATION
  );

  static final TextAttributesKey OBJECT_KEY = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.OBJECT_KEY",
          HighlighterColors.TEXT
  );

  static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.NUMBER",
          DefaultLanguageHighlighterColors.NUMBER
  );

  static final TextAttributesKey BOOLEAN = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.BOOLEAN",
          DefaultLanguageHighlighterColors.NUMBER
  );

  static final TextAttributesKey STRING_LITERAL = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.STRING_LITERAL",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.STRING",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey HEREDOC_ID = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.HEREDOC_ID",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey HEREDOC_CONTENT = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.HEREDOC_CONTENT",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey HEREGEX_ID = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.HEREGEX_ID",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey HEREGEX_CONTENT = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.HEREGEX_CONTENT",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey JAVASCRIPT_ID = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.JAVASCRIPT_ID",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey JAVASCRIPT_CONTENT = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.JAVASCRIPT_CONTENT",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey EXPRESSIONS_SUBSTITUTION_MARK = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.EXPRESSIONS_SUBSTITUTION_MARK",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey LINE_COMMENT = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.LINE_COMMENT",
          DefaultLanguageHighlighterColors.LINE_COMMENT
  );

  static final TextAttributesKey BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.BLOCK_COMMENT",
          DefaultLanguageHighlighterColors.BLOCK_COMMENT
  );

  static final TextAttributesKey PARENTHESIS = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.PARENTHESIS",
          DefaultLanguageHighlighterColors.PARENTHESES
  );

  static final TextAttributesKey BRACKETS = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.BRACKET",
          DefaultLanguageHighlighterColors.BRACKETS
  );

  static final TextAttributesKey BRACES = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.BRACE",
          DefaultLanguageHighlighterColors.BRACES
  );

  static final TextAttributesKey OPERATIONS = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.OPERATIONS",
          DefaultLanguageHighlighterColors.OPERATION_SIGN
  );

  static final TextAttributesKey EXISTENTIAL = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.EXISTENTIAL",
          DefaultLanguageHighlighterColors.OPERATION_SIGN
  );

  static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.KEYWORD",
          DefaultLanguageHighlighterColors.KEYWORD
  );

  static final TextAttributesKey RANGE = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.RANGE",
          DefaultLanguageHighlighterColors.OPERATION_SIGN
  );

  static final TextAttributesKey SPLAT = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.SPLAT",
          DefaultLanguageHighlighterColors.OPERATION_SIGN
  );

  static final TextAttributesKey THIS = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.THIS",
          DefaultLanguageHighlighterColors.OPERATION_SIGN
  );

  static final TextAttributesKey COLON = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.COLON",
          DefaultLanguageHighlighterColors.OPERATION_SIGN
  );

  static final TextAttributesKey PROTOTYPE = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.PROTOTYPE",
          DefaultLanguageHighlighterColors.OPERATION_SIGN
  );

  static final TextAttributesKey FUNCTION = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.FUNCTION",
          DefaultLanguageHighlighterColors.OPERATION_SIGN
  );

  static final TextAttributesKey FUNCTION_BINDING = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.FUNCTION_BINDING",
          DefaultLanguageHighlighterColors.OPERATION_SIGN
  );

  static final TextAttributesKey REGULAR_EXPRESSION_ID = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.REGULAR_EXPRESSION_ID",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey REGULAR_EXPRESSION_CONTENT = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.REGULAR_EXPRESSION_CONTENT",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey REGULAR_EXPRESSION_FLAG = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.REGULAR_EXPRESSION_FLAG",
          DefaultLanguageHighlighterColors.STRING
  );

  static final TextAttributesKey ESCAPE_SEQUENCE = TextAttributesKey.createTextAttributesKey(
          "COFFEESCRIPT.ESCAPE_SEQUENCE",
          DefaultLanguageHighlighterColors.STRING
  );

  static {
    TOKENS_TO_STYLES = new HashMap<IElementType, TextAttributesKey>();
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.BAD_CHARACTER, BAD_CHARACTER);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.ERROR_ELEMENT, BAD_CHARACTER);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.WHITE_SPACE, HighlighterColors.TEXT);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.TERMINATOR, HighlighterColors.TEXT);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.DOT, DOT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.COMMA, COMMA);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.COLON, COLON);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.SEMICOLON, SEMICOLON);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.IDENTIFIER, IDENTIFIER);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.CLASS_NAME, CLASS_NAME);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.CONSTANT, CONSTANT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.FUNCTION_NAME, FUNCTION_NAME);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.OBJECT_KEY, OBJECT_KEY);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.NUMBER, NUMBER);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.BOOL, BOOLEAN);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.ESCAPE_SEQUENCE, ESCAPE_SEQUENCE);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.STRING_LITERAL, STRING_LITERAL);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.STRING, STRING);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.HEREDOC_START, HEREDOC_ID);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.HEREDOC, HEREDOC_CONTENT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.HEREDOC_END, HEREDOC_ID);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.REGEX_START, REGULAR_EXPRESSION_ID);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.REGEX, REGULAR_EXPRESSION_CONTENT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.REGEX_BRACKET_START, REGULAR_EXPRESSION_CONTENT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.REGEX_BRACKET_END, REGULAR_EXPRESSION_CONTENT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.REGEX_PARENTHESIS_START, REGULAR_EXPRESSION_CONTENT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.REGEX_PARENTHESIS_END, REGULAR_EXPRESSION_CONTENT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.REGEX_BRACE_START, REGULAR_EXPRESSION_CONTENT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.REGEX_BRACE_END, REGULAR_EXPRESSION_CONTENT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.REGEX_END, REGULAR_EXPRESSION_ID);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.REGEX_FLAG, REGULAR_EXPRESSION_FLAG);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.HEREGEX_START, HEREGEX_ID);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.HEREGEX, HEREGEX_CONTENT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.HEREGEX_END, HEREGEX_ID);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.INTERPOLATION_START, EXPRESSIONS_SUBSTITUTION_MARK);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.INTERPOLATION_END, EXPRESSIONS_SUBSTITUTION_MARK);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.JAVASCRIPT_LITERAL, JAVASCRIPT_ID);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.JAVASCRIPT, JAVASCRIPT_CONTENT);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.LINE_COMMENT, LINE_COMMENT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.BLOCK_COMMENT, BLOCK_COMMENT);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.PARENTHESIS_START, PARENTHESIS);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.PARENTHESIS_END, PARENTHESIS);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.BRACKET_START, BRACKETS);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.BRACKET_END, BRACKETS);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.BRACE_START, BRACES);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.BRACE_END, BRACES);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.EQUAL, OPERATIONS);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.COMPOUND_ASSIGN, OPERATIONS);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.COMPARE, OPERATIONS);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.LOGIC, OPERATIONS);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.PLUS, OPERATIONS);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.MINUS, OPERATIONS);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.MATH, OPERATIONS);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.EXIST, EXISTENTIAL);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.RANGE, RANGE);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.SPLAT, SPLAT);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.THIS, THIS);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.PROTOTYPE, PROTOTYPE);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.FUNCTION, FUNCTION);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.FUNCTION_BIND, FUNCTION_BINDING);

    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.UNARY, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.CLASS, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.EXTENDS, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.IF, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.ELSE, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.THEN, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.UNLESS, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.FOR, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.IN, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.OF, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.BY, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.WHILE, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.UNTIL, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.SWITCH, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.WHEN, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.TRY, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.CATCH, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.THROW, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.FINALLY, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.BREAK, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.CONTINUE, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.RETURN, KEYWORD);
    TOKENS_TO_STYLES.put(CoffeeScriptTokenTypes.INSTANCE_OF, KEYWORD);
  }

  @Nonnull
  public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
    return pack(TOKENS_TO_STYLES.get(tokenType));
  }
}
