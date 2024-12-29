package org.coffeebrew.file;

import consulo.annotation.component.ExtensionImpl;
import consulo.virtualFileSystem.fileType.FileTypeConsumer;
import consulo.virtualFileSystem.fileType.FileTypeFactory;

import jakarta.annotation.Nonnull;

@ExtensionImpl
public class CoffeeScriptFileTypeFactory extends FileTypeFactory {
  @Override
  public void createFileTypes(@Nonnull FileTypeConsumer fileTypeConsumer) {
    fileTypeConsumer.consume(CoffeeScriptFileType.INSTANCE);
  }
}
