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


  def beautifulDays(i: Int, j: Int, k: Int): Int = {
    var count = 0
    for(n <- i to j){
      val reversenum = n.toString.reverse.toInt
      val diff = (reversenum - n).abs
      if (diff % k == 0){
        count = count + 1
      }
    }
    count
  }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val i = firstMultipleInput(0).toInt

        val j = firstMultipleInput(1).toInt

        val k = firstMultipleInput(2).toInt

        val result = Result.beautifulDays(i, j, k)

        printWriter.println(result)

        printWriter.close()
    }
}
