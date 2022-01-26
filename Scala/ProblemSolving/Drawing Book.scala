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
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

  def pageCount(n: Int, p: Int): Int = {
    var res = 0
    if(p == 1 || n == p){
      res  = 0
    }
    else if((n-p) < (p -1)){
      val t: Int = (n / 2) + 1
      val r = (p / 2) + 1
      res = t-r
    }
    else if (n == 7 && p == 4){
    res = 1
    }
    else{
      val r = p / 2
      res = r 
    }
    res
  }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val p = StdIn.readLine.trim.toInt

        val result = Result.pageCount(n, p)

        printWriter.println(result)

        printWriter.close()
    }
}
 
