import microsites._
import design.hamu.Dependencies

lazy val commonSettings = Seq(
  scalaVersion := "2.13.2",
  organization := "com.disneystreaming",
  version := "0.0.1",
  scalacOptions := Seq("-Xlint", "-Ywarn-unused", "-deprecation", "-Ymacro-annotations"),
  dependencyUpdatesFailBuild := true
)
