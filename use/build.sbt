import java.net.URI
import myplugin.MyPlugin

ThisBuild / organization := "gzm0s-hackeries"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val one = project
  .enablePlugins(MyPlugin)
  .dependsOn(ProjectRef(new URI("../core"), "lib"))
  .dependsOn(latelib)

lazy val two = project
  .enablePlugins(MyPlugin)
  .settings(myPluginKey := "another value!")
  .dependsOn(ProjectRef(new URI("../core"), "lib"))
  .dependsOn(latelib)

lazy val latelib = project
