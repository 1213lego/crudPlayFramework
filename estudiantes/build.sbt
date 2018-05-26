name := """estudiantes"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += javaJdbc
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.2"

/*  includeFilter in (Assets, LessKeys.less) := "foo.less" | "bar.less"
includeFilter in (Assets, LessKeys.less) := "*.less"

excludeFilter in (Assets, LessKeys.less) := "_*.less"
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.4"   */
