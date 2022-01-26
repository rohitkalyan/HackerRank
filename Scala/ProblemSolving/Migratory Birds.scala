import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
//import scala.collection.immutable._
//import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    def migratoryBirds(arr: Array[Int]): Int = {
    // Write your code here
    
    val occurencess = arr.groupBy(identity).mapValues(_.size)

    val maxValue = occurencess.maxBy(item => item._2)
    val maxPairs = occurencess.filter(item => item._2 == maxValue._2)
    val maxNumber: Int = maxPairs.minBy(_._1)._1

    maxNumber
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arrCount = StdIn.readLine.trim.toInt

        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.migratoryBirds(arr)

        printWriter.println(result)

        printWriter.close()
    }
}
