import sbt._
import Keys._
import Dependencies._

lazy val mytest = (project in file("mytest"))
  .settings(
    libraryDependencies ++= commonDependency)


