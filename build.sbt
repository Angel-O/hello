val commonSettings = Seq(
  organization := "com.Angelo",
  scalaVersion := "2.12.7"
)

val testDependencies = Seq(
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)

lazy val root = (project in file("."))
  .settings(
    inThisBuild(commonSettings), 
    name := "hello", 
    version := "1.0", 
    libraryDependencies ++= testDependencies
   )
