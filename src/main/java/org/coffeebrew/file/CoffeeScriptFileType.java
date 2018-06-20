package org.coffeebrew.file;

import org.coffeebrew.CoffeeScriptIcons;
import org.coffeebrew.CoffeeScriptLanguage;
import org.jetbrains.annotations.NonNls;
import javax.annotation.Nonnull;
import com.intellij.openapi.fileTypes.LanguageFileType;
import consulo.ui.image.Image;

/**
 * CoffeeScript file properties
 *
 * @author Michael kessler
 * @since 0.1.0
 */
public class CoffeeScriptFileType extends LanguageFileType
{
	public static final CoffeeScriptFileType INSTANCE = new CoffeeScriptFileType();

	@NonNls
	public static final String DEFAULT_EXTENSION = "coffee";

	private CoffeeScriptFileType()
	{
		super(CoffeeScriptLanguage.INSTANCE);
	}

	@Nonnull
	@NonNls
	public String getId()
	{
		return "CoffeeScript";
	}

	@NonNls
	@Nonnull
	public String getDescription()
	{
		return "CoffeeScript Files";
	}

	@Nonnull
	@NonNls
	public String getDefaultExtension()
	{
		return DEFAULT_EXTENSION;
	}

	@Nonnull
	public Image getIcon()
	{
		return CoffeeScriptIcons.FILE_TYPE;
	}
}
