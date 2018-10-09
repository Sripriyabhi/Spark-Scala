name := "Spark-Scala"

version := "0.1"

scalaVersion := "2.11.0"

name := "example"

version := "0.1"

scalaVersion := "2.11.0"




// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"

// https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.10.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka-0-10
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.2.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql-kafka-0-10
libraryDependencies += "org.apache.spark" %% "spark-sql-kafka-0-10" % "2.2.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.2.0" % "provided"

// https://mvnrepository.com/artifact/com.databricks/spark-avro
libraryDependencies += "com.databricks" %% "spark-avro" % "4.0.0"



// https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients
libraryDependencies += "org.apache.kafka" % "kafka-clients" % "0.10.0.0"

// https://mvnrepository.com/artifact/org.apache.avro/avro
libraryDependencies += "org.apache.avro" % "avro" % "1.8.0"

// https://mvnrepository.com/artifact/io.confluent.kafka/connect-utils
libraryDependencies += "io.confluent.kafka" % "connect-utils" % "0.1.0"


// https://mvnrepository.com/artifact/io.confluent.avro/avro-random-generator
libraryDependencies += "io.confluent.avro" % "avro-random-generator" % "0.1.0"

// https://mvnrepository.com/artifact/com.typesafe/config
libraryDependencies += "com.typesafe" % "config" % "1.3.2"

// https://mvnrepository.com/artifact/com.twitter/bijection-core
libraryDependencies += "com.twitter" %% "bijection-core" % "0.9.4"

// https://mvnrepository.com/artifact/org.apache.kafka/kafka-streams
libraryDependencies += "org.apache.kafka" % "kafka-streams" % "0.10.0.0"


val repositories = Seq(
  "confluent" at "http://packages.confluent.io/maven/",
  Resolver.sonatypeRepo("public"))

libraryDependencies ++= Seq(

  "io.confluent" % "kafka-avro-serializer" % "3.2.1"

)

//FLINK RELATED LIBRARIES


// https://mvnrepository.com/artifact/org.apache.flink/flink-core
libraryDependencies += "org.apache.flink" % "flink-core" % "1.4.0"

// https://mvnrepository.com/artifact/org.apache.flink/flink-scala
libraryDependencies += "org.apache.flink" %% "flink-scala" % "1.4.0"

// https://mvnrepository.com/artifact/org.apache.flink/flink-streaming-scala
libraryDependencies += "org.apache.flink" %% "flink-streaming-scala" % "1.4.0"

// https://mvnrepository.com/artifact/org.apache.flink/flink-tests
libraryDependencies += "org.apache.flink" %% "flink-tests" % "1.4.0" % Test

// https://mvnrepository.com/artifact/org.apache.flink/flink-clients
libraryDependencies += "org.apache.flink" %% "flink-clients" % "1.4.0"

// https://mvnrepository.com/artifact/org.apache.flink/flink-connector-kafka-0.10
libraryDependencies += "org.apache.flink" %% "flink-connector-kafka-0.10" % "1.4.0"









