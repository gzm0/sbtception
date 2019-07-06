import myplugin.MyPlugin

lazy val one = project
  .enablePlugins(MyPlugin)

lazy val two = project
  .enablePlugins(MyPlugin)
  .settings(myPluginKey := "another value!")
