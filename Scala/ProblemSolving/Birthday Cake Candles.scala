import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {
    def birthdayCakeCandles(candles: Array[Int]): Int = {
    val max = candles.toList.max
    var maxCount = 0
    for (maxOcc <- candles){
    if(maxOcc == max){
    maxCount = maxCount + 1
    }
    }
    maxCount
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val candlesCount = StdIn.readLine.trim.toInt

        val candles = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.birthdayCakeCandles(candles)

        printWriter.println(result)

        printWriter.close()
    }
}
