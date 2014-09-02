
name := "TwitterPopularTags"

version := "0.3.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq("org.apache.spark" %% "spark-core" % "1.0.1",
"org.apache.spark" %% "spark-streaming" % "1.0.1",
"org.apache.spark" %% "spark-streaming-twitter" % "1.0.1")

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
