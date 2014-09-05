SparkTwitterAnalysis
====================

A standalone application using the Spark API in Scala. The application uses Simple Build(SBT) for building the project.

>sbt\sbt clean

>sbt\sbt package 

>sbt\sbt 'run \<arguments\>'

Example : 

sbt\sbt 'run local[4] \<consumer-key\> \<consumerSecret-key\> \<accessToken\> \<accessTokenSecret\> india'


To run other app just put multiple scala files with "main" and while doing "sbt/sbt run" it will ask which class to run. Then select the number from there.
