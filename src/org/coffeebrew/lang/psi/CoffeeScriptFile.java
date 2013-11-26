package org.coffeebrew.lang.psi;

import static org.coffeebrew.file.CoffeeScriptFileType.INSTANCE;

import org.jetbrains.annotations.NotNull;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;

/**
 * A CoffeeScript file
 *
 * @author Michael Kessler
 * @since 0.1.0
 */
public class CoffeeScriptFile extends PsiFileBase {

  public CoffeeScriptFile(FileViewProvider viewProvider) {
    super(viewProvider, INSTANCE.getLanguage());
  }

  @NotNull
  public FileType getFileType() {
    return INSTANCE;
  }

  public String toString() {
    return "CoffeeScript File: " + getName();
  }

}
