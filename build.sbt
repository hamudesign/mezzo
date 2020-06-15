import microsites._
import design.hamu.Dependencies

lazy val commonSettings = Seq(
  scalaVersion := "2.13.2",
  organization := "com.disneystreaming",
  version := "0.0.1",
  scalacOptions := Seq("-Xlint", "-Ywarn-unused", "-deprecation", "-Ymacro-annotations"),
  dependencyUpdatesFailBuild := true
)

lazy val root = project
  .in(file("."))

lazy val docs = project
  .in(file("docs"))
  .settings(
    micrositeName := "Mezzo",
    micrositeCompilingDocsTool := WithTut,
    micrositeBaseUrl := "mezzo",
    micrositeHomepage := "https://hamuhouse.github.io/mezzo/",
    micrositeHighlightTheme := "atom-one-light",
    git.remoteRepo := "https://github.com/hamuhouse/mezzo.git"
  )
  .enablePlugins(MicrositesPlugin)

