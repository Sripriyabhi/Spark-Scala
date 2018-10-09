package Spark



import org.apache.spark.sql.SparkSession

object file_conversions {

  def main(args: Array[String]): Unit = {


    val spark = SparkSession
      .builder
      .appName("file_conversions")
      .master("local")
      .getOrCreate()


    // CSV TO AVRO CONVERSION

    val csv_avro = spark
      .read
      .format("csv")
      .load("file:///Users/priya/datasets/data.csv")

    csv_avro.printSchema()

    csv_avro.write
      .format("com.databricks.spark.avro")
      .save("file:///Users/priya/datasets/csv-avro")


    // AVRO TO CSV CONVERSION

    val avro_csv = spark
      .read
      .format("com.databricks.spark.avro")
      .load("file:///Users/priya/datasets/data.avro")

    avro_csv.printSchema()

    avro_csv.write
      .format("com.databricks.spark.csv")
      .save("file:///Users/priya/datasets/avro-csv")



    // CSV TO JSON CONVERSION

    val csv_json = spark
      .read
      .format("com.databricks.spark.csv")
      .option("header", "true")
      .csv("file:////Users/priya/datasets/data.csv")

    csv_json.printSchema()

    csv_json.write
      .option("header", "true")
      .save("file:////Users/priya/datasets/csv-json")



    //JSON TO CSV CONVERSION


    val json_csv = spark
      .read
      .json("file:////Users/priya/datasets/data.json")

    json_csv.printSchema()

    json_csv.write
      .format("com.databricks.spark.csv")
      .option("header", "true")
      .save("file:////Users/priya/datasets/json-csv")



    //JSON TO AVRO CONVERSION

    val json_avro = spark
      .read
      .json("file:////Users/priya/datasets/data.json")

    json_avro.printSchema()

    json_avro.write
      .format("com.databricks.spark.avro")
      .option("header", "true")
      .save("file:////Users/priya/datasets/json-avro")




    //AVRO TO JSON CONVERSION

    val avro_json = spark
      .read
      .format("com.databricks.spark.avro")
      .load("file:///Users/priya/datasets/data.avro")

    avro_json.printSchema()

    avro_json.write
      .format("json")
      .save("file:///Users/priya/datasets/avro-json")



  }


}
