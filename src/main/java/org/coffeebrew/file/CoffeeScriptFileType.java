package org.coffeebrew.file;

import consulo.coffeescript.icon.CoffeeScriptIconGroup;
import consulo.language.file.LanguageFileType;
import consulo.localize.LocalizeValue;
import consulo.ui.image.Image;
import jakarta.annotation.Nonnull;
import org.coffeebrew.CoffeeScriptLanguage;

/**
 * CoffeeScript file properties
 *
 * @author Michael kessler
 * @since 0.1.0
 */
public class CoffeeScriptFileType extends LanguageFileType {
  public static final CoffeeScriptFileType INSTANCE = new CoffeeScriptFileType();

  public static final String DEFAULT_EXTENSION = "coffee";

  private CoffeeScriptFileType() {
    super(CoffeeScriptLanguage.INSTANCE);
  }

  @Nonnull
  public String getId() {
    return "CoffeeScript";
  }

  @Nonnull
  public LocalizeValue getDescription() {
    return LocalizeValue.localizeTODO("CoffeeScript Files");
  }

  @Nonnull
  public String getDefaultExtension() {
    return DEFAULT_EXTENSION;
  }

  @Nonnull
  public Image getIcon() {
    return CoffeeScriptIconGroup.coffeescript();
  }
}
