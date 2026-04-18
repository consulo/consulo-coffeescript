/**
 * @author VISTALL
 * @since 15/01/2023
 */
module consulo.coffeescript {
  requires consulo.code.editor.api;
  requires consulo.color.scheme.api;
  requires consulo.language.api;
  requires consulo.language.editor.api;
  requires consulo.language.impl;
  requires consulo.localize.api;
  requires consulo.ui.api;
  requires consulo.virtual.file.system.api;

  exports consulo.coffeescript.icon;
  exports org.coffeebrew;
  exports org.coffeebrew.file;
  exports org.coffeebrew.highlighter;
  exports org.coffeebrew.lang.lexer;
  exports org.coffeebrew.lang.parser;
  exports org.coffeebrew.lang.psi;
  exports org.coffeebrew.lang.psi.impl;
}
