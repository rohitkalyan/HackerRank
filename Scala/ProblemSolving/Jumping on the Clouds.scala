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
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    def jumpingOnClouds(c: Array[Int]): Int = {
      var i = 0
      var step = 0
       if(c.size == 2){
       step = 1
       i = c.size + 1
        }
        while(i < c.size - 1){
            if(c(i + 2) != 1){
                step += 1
                i = i +2
                  if(i == c.size -2){
                        step += 1
                        i = i + 1
                    }
                }
                else{
                step += 1
                i = i + 1
                }
  }
  step
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val c = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.jumpingOnClouds(c)

        printWriter.println(result)

        printWriter.close()
    }
}
