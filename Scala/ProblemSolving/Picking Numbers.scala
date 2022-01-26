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

    def pickingNumbers(a: Array[Int]): Int = {
    val b = a.sorted
    var count = 0
    var max = 0
    for(i <- 0 until b.size){
      for(j <- i+1 until b.size){
        if((b(i) - b(j)).abs <= 1){
          count = count + 1
        }
      }
      if(count > max){
        max = count
      }
      count = 0
    }
    max + 1
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.pickingNumbers(a)

        printWriter.println(result)

        printWriter.close()
    }
}
