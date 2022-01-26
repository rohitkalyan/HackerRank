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

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

  def twoStrings(s1: String, s2: String): String = {
    // Write your code here
    val inter = s1.intersect(s2)
    if(inter.isEmpty){
      "NO"
    }
    else{
      "YES"
    }
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val q = StdIn.readLine.trim.toInt

        for (qItr <- 1 to q) {
            val s1 = StdIn.readLine

            val s2 = StdIn.readLine

            val result = Result.twoStrings(s1, s2)

            printWriter.println(result)
        }

        printWriter.close()
    }
}
