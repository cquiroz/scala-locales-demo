// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "scala-js-locales-demo"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

persistLauncher in Compile := true

persistLauncher in Test := false

resolvers += Resolver.sonatypeRepo("snapshots")

//resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
    "com.github.cquiroz" %%% "scala-java-locales" % "0.1.0+29"
)
