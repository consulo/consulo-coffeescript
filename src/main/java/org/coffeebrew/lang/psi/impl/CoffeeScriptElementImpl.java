package org.coffeebrew.lang.psi.impl;

import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import org.coffeebrew.lang.psi.CoffeeScriptElement;

/**
 * @author Michael Kessler
 * @since 0.1.8
 */
public class CoffeeScriptElementImpl extends ASTWrapperPsiElement implements CoffeeScriptElement {

  private final ASTNode node;

  public CoffeeScriptElementImpl(final ASTNode node) {
    super(node);
    this.node = node;
  }
}
