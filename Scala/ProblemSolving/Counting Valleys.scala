import java.io._
import java.math._
import java.security._
import java.text._
//import java.util._
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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    def countingValleys(steps: Int, path: String): Int = {
        //println("path: "+path)
        val pathArr: List[Char] = path.toList
        var count = 0
        var valluyCount = 0
        path.foreach(ch => {
        if(ch == 'U'){
        count += 1
        if(count == 0){
        valluyCount += 1
        }
        }
        else{
        count -= 1}
        })
        valluyCount
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val steps = StdIn.readLine.trim.toInt

        val path = StdIn.readLine

        val result = Result.countingValleys(steps, path)

        printWriter.println(result)

        printWriter.close()
    }
}
