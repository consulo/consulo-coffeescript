package org.coffeebrew.file;

import javax.swing.Icon;

import org.coffeebrew.CoffeeScriptIcons;
import org.coffeebrew.CoffeeScriptLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.fileTypes.LanguageFileType;

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

	@NotNull
	@NonNls
	public String getName()
	{
		return "CoffeeScript";
	}

	@NonNls
	@NotNull
	public String getDescription()
	{
		return "CoffeeScript Files";
	}

	@NotNull
	@NonNls
	public String getDefaultExtension()
	{
		return DEFAULT_EXTENSION;
	}

	@NotNull
	public Icon getIcon()
	{
		return CoffeeScriptIcons.FILE_TYPE;
	}
}
