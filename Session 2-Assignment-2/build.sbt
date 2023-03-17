ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Session 2-Assignment-2",
    idePackagePrefix := Some("com.knoldus.assignment2"),
      libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )
