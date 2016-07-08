package demo

import java.text.DecimalFormatSymbols
import java.util.Locale

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

import locales.LocaleRegistry
import locales.cldr.data.fi_FI

@JSExport("DemoApp")
object DemoApp extends js.JSApp {
  @scala.scalajs.js.annotation.JSExport
  override def main(): Unit = {
    // Minimal demo used for sanity checks and for size improvements
    LocaleRegistry.installLocale(fi_FI)
    val tag = fi_FI.languageTag
    val dfs = DecimalFormatSymbols.getInstance(Locale.forLanguageTag(tag))
    println(fi_FI.languageTag)
    println("NaN: " + dfs.getNaN)
  }
}
