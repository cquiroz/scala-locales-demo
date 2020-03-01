// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)
enablePlugins(LocalesPlugin)
import locales._

Global / onChangedBuildSource := ReloadOnSourceChanges

name := "scala-js-locales-demo"

version := "0.2.0"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "io.github.cquiroz" %%% "scala-java-locales" % "0.6.0-SNAPSHOT"
)

localesFilter := LocalesFilter.Selection("fi", "fi-FI")

scalaJSUseMainModuleInitializer := true
