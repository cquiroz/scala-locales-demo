// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "scala-js-locales-demo"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

persistLauncher in Compile := true

persistLauncher in Test := false

libraryDependencies ++= Seq(
    "com.github.cquiroz" %%% "scalajs-locales" % "0.1.0-SNAPSHOT",
    "org.querki" %%% "jquery-facade" % "1.0-RC6"
)

jsDependencies += "org.webjars" % "jquery" % "2.2.1" / "jquery.js" minified "jquery.min.js"
