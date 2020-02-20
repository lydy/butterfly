import sbt._

object Dependencies {

  lazy val slf4jVersion = "1.7.25"
  lazy val logbackVersion = "1.2.3"
  lazy val json4sVersion = "3.5.4"

  lazy val commonDependency = Seq(
    "org.scalatest" %% "scalatest" % "3.0.0" % Test,
    "org.scalamock" %% "scalamock" % "4.1.0" % Test)
}