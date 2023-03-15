name := "arkon-scala-excercises"

version := "0.0.1"

scalaVersion := "2.13.10"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-effect" % "3.4.8",
  "org.scalactic" %% "scalactic" % "3.2.7",   
  "org.scalatest" %% "scalatest" % "3.2.7" % "test",
  "com.chuusai" %% "shapeless" % "2.3.3"
)
