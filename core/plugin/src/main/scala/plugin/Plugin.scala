package myplugin

import sbt._
import Keys._

object MyPlugin extends AutoPlugin {
  object autoImport {
    val myPluginKey = settingKey[String]("myPluginKey")
  }

  import autoImport._

  override lazy val projectSettings = Seq(
    myPluginKey := myplib.MyPLib.MyConst,
    libraryDependencies ++= Seq(
        "gzm0s-hackeries" %% "lib" % "0.1.0-SNAPSHOT",
        "gzm0s-hackeries" %% "latelib" % "0.1.0-SNAPSHOT"
    )
  )
}
