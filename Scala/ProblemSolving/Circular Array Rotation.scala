import java.io._
import java.math._
import java.security._
import java.text._
// import java.util._
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

    def circularArrayRotation(a: Array[Int], k: Int, queries: Array[Int]): Array[Int] = {
    var list = new Array[Int](a.size)
        var arr = List[Int]()
    for(i <- 0 until a.size){
      var res = (i + k) % a.size
     list(res) = a(i)
    }
    for(i <- queries){
      arr ::= list(i)
    }
    arr.toArray.reverse
  }
}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val n = firstMultipleInput(0).toInt

        val k = firstMultipleInput(1).toInt

        val q = firstMultipleInput(2).toInt

        val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val queries = Array.ofDim[Int](q)

        for (i <- 0 until q) {
            val queriesItem = StdIn.readLine.trim.toInt
            queries(i) = queriesItem
        }

        val result = Result.circularArrayRotation(a, k, queries)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}
