package demo

import java.text.DecimalFormatSymbols
import java.util.Locale

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
//import org.querki.jquery.$

import scala.scalajs.locale.LocaleRegistry
import scala.scalajs.locale.ldml.data.all._

@JSExport("DemoApp")
object DemoApp extends js.JSApp {
  @scala.scalajs.js.annotation.JSExport
  override def main(): Unit = {
    // Minimal demo used for sanity checks and for size improvements
    LocaleRegistry.installLocale(ar)
    val tag = ar.languageTag
    val dfs = DecimalFormatSymbols.getInstance(Locale.forLanguageTag(tag))
    println(ar.languageTag)
    println("NaN: " + dfs.getNaN)
  }
}
