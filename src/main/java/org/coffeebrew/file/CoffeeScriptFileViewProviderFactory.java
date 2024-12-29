package org.coffeebrew.file;

import consulo.annotation.component.ExtensionImpl;
import consulo.language.Language;
import consulo.language.file.FileViewProvider;
import consulo.language.file.VirtualFileViewProviderFactory;
import consulo.language.psi.PsiManager;
import consulo.virtualFileSystem.VirtualFile;
import consulo.virtualFileSystem.fileType.FileType;

import jakarta.annotation.Nonnull;

/**
 * @author Michael Kessler
 * @since 0.1.5
 */
@ExtensionImpl
public class CoffeeScriptFileViewProviderFactory implements VirtualFileViewProviderFactory {

  public FileViewProvider createFileViewProvider(VirtualFile file, Language language, PsiManager manager, boolean physical) {
    return new CoffeeScriptViewProvider(manager, file, physical, language);
  }

  @Nonnull
  @Override
  public FileType getFileType() {
    return CoffeeScriptFileType.INSTANCE;
  }
}
