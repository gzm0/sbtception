package myplugin

import sbt._
import Keys._

object MyPlugin extends AutoPlugin {
  object autoImport {
    val myPluginKey = settingKey[String]("myPluginKey")
  }

  import autoImport._

  override lazy val projectSettings = Seq(
    myPluginKey := "the value!"
  )
}
