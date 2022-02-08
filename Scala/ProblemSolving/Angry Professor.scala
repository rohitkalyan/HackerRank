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
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    def angryProfessor(k: Int, a: Array[Int]): String = {
        var count = 0
        for(i <- a){
            if(i <= 0){
                count = count + 1
                }
        }
        
        if(count >= k){
            "NO"}
        else{
            "YES"}

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val t = StdIn.readLine.trim.toInt

        for (tItr <- 1 to t) {
            val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

            val n = firstMultipleInput(0).toInt

            val k = firstMultipleInput(1).toInt

            val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
            val result = Result.angryProfessor(k, a)

            printWriter.println(result)
        }

        printWriter.close()
    }
}
