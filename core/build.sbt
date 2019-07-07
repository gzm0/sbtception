ThisBuild / organization := "gzm0s-hackeries"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val plugin = project
  .enablePlugins(SbtPlugin)
  .dependsOn(plib)

lazy val lib = project

lazy val plib = project
