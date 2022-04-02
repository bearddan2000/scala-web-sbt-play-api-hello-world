lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "play-scala-web",

    version := "1.0",

    scalaVersion := "2.13.2",

    libraryDependencies += guice
)
