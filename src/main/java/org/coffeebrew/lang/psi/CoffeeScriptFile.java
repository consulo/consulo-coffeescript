package org.coffeebrew.lang.psi;

import consulo.language.file.FileViewProvider;
import consulo.language.impl.psi.PsiFileBase;
import org.coffeebrew.CoffeeScriptLanguage;

/**
 * A CoffeeScript file
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
public class CoffeeScriptFile extends PsiFileBase {
  public CoffeeScriptFile(FileViewProvider viewProvider) {
    super(viewProvider, CoffeeScriptLanguage.INSTANCE);
  }
}
