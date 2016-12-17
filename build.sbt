// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "scala-js-locales-demo"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.1"

persistLauncher in Compile := true

persistLauncher in Test := false

libraryDependencies ++= Seq(
    "io.github.cquiroz" %%% "scala-java-locales" % "0.5.0-cldr30"
)
