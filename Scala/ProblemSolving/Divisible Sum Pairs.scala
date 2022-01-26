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
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

    var count = 0
    
    def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {
        for (i <- 0 until n - 1){
            for (j <- i+1 until n){
                if ((ar(i) + ar(j))% k == 0){
                     count += 1
        }
    }
  }
  count 
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val n = firstMultipleInput(0).toInt

        val k = firstMultipleInput(1).toInt

        val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.divisibleSumPairs(n, k, ar)

        printWriter.println(result)

        printWriter.close()
    }
}
