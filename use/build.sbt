import java.net.URI
import myplugin.MyPlugin

lazy val one = project
  .enablePlugins(MyPlugin)
  .dependsOn(ProjectRef(new URI("../core"), "lib"))

lazy val two = project
  .enablePlugins(MyPlugin)
  .settings(myPluginKey := "another value!")
  .dependsOn(ProjectRef(new URI("../core"), "lib"))
