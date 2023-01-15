package org.coffeebrew.lang.lexer;

import consulo.language.ast.IElementType;
import org.coffeebrew.file.CoffeeScriptFileType;

/**
 * Custom CoffeeScript element types.
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
public class CoffeeScriptElementType extends IElementType {

  private String name = null;

  public CoffeeScriptElementType(String name) {
    super(name, CoffeeScriptFileType.INSTANCE.getLanguage());

    this.name = name;
  }

  public String toString() {
    return name;
  }

}
