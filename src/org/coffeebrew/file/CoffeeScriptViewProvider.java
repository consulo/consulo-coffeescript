package org.coffeebrew.file;

import org.jetbrains.annotations.NotNull;
import com.intellij.lang.Language;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.SingleRootFileViewProvider;

/**
 * CoffeeScript view provider that disables incremental reparsing
 *
 * @author Michael Kessler
 * @since 0.1.5
 */
public class CoffeeScriptViewProvider extends SingleRootFileViewProvider {

  public CoffeeScriptViewProvider(@NotNull PsiManager manager, @NotNull VirtualFile file) {
   super(manager, file);
  }

  public CoffeeScriptViewProvider(@NotNull PsiManager manager, @NotNull VirtualFile virtualFile, final boolean physical) {
    super(manager, virtualFile, physical);
  }

  protected CoffeeScriptViewProvider(@NotNull PsiManager manager, @NotNull VirtualFile virtualFile, final boolean physical, @NotNull Language language) {
    super(manager, virtualFile, physical, language);
  }

  @Override
  public boolean supportsIncrementalReparse(@NotNull final Language rootLanguage) {
    return false;
  }

}
