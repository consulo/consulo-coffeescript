package org.coffeebrew.file;

import javax.annotation.Nonnull;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;

public class CoffeeScriptFileTypeFactory extends FileTypeFactory
{
	@Override
	public void createFileTypes(@Nonnull FileTypeConsumer fileTypeConsumer)
	{
		fileTypeConsumer.consume(CoffeeScriptFileType.INSTANCE);
	}
}
