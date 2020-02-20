import sbt._
import Keys._

object Settings {
  lazy val basicSettings: Seq[Setting[_]] = Seq(
    autoScalaLibrary := false,
    resolvers += "mvnrepository" at "http://mvnrepository.com/artifact/",
    resolvers += "JFrog" at "https://oss.jfrog.org/libs-release/",
    resolvers += Resolver.bintrayRepo("hseeberger", "maven"),
    javacOptions := Seq( //"-source", Globals.jvmVersion,
    ),
    scalacOptions := Seq(
      "-encoding", "utf8",
      "-g:vars",
      "-unchecked",
      "-deprecation",
      "-Yresolve-term-conflict:package"),
    shellPrompt in ThisBuild := { state => "sbt (%s)> ".format(Project.extract(state).currentProject.id) })
}