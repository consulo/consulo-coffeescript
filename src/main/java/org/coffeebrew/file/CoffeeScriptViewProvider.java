package org.coffeebrew.file;

import consulo.language.Language;
import consulo.language.impl.file.SingleRootFileViewProvider;
import consulo.language.psi.PsiManager;
import consulo.virtualFileSystem.VirtualFile;

import jakarta.annotation.Nonnull;


/**
 * CoffeeScript view provider that disables incremental reparsing
 *
 * @author Michael Kessler
 * @since 0.1.5
 */
public class CoffeeScriptViewProvider extends SingleRootFileViewProvider {

  public CoffeeScriptViewProvider(@Nonnull PsiManager manager, @Nonnull VirtualFile file) {
   super(manager, file);
  }

  public CoffeeScriptViewProvider(@Nonnull PsiManager manager, @Nonnull VirtualFile virtualFile, final boolean physical) {
    super(manager, virtualFile, physical);
  }

  protected CoffeeScriptViewProvider(@Nonnull PsiManager manager, @Nonnull VirtualFile virtualFile, final boolean physical, @Nonnull Language language) {
    super(manager, virtualFile, physical, language);
  }

  @Override
  public boolean supportsIncrementalReparse(@Nonnull final Language rootLanguage) {
    return false;
  }
}
