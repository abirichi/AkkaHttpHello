name := "HelloWorldScalaHttp"

version := "0.1"

scalaVersion := "2.13.7"

idePackagePrefix := Some("com.abhi.practice")

libraryDependencies ++= Seq(
              "com.typesafe.akka" %% "akka-actor" % "2.5.31",
              "com.typesafe.akka" %% "akka-stream" % "2.5.31",
              "com.typesafe.akka" %% "akka-http" % "10.1.13")

