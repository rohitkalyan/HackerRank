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
    def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
    // Write your code here
    var appleCount = 0
    var orangeCount = 0
    apples.foreach(element => {
        if(element + a >= s && element + a <= t )
        appleCount = appleCount + 1
    })
    oranges.foreach(element => {
        if(element + b >= s && element + b <= t )
        orangeCount = orangeCount + 1
    })
    println(appleCount)
    println(orangeCount)

    }

}

object Solution {
    def main(args: Array[String]) {
        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val s = firstMultipleInput(0).toInt

        val t = firstMultipleInput(1).toInt

        val secondMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val a = secondMultipleInput(0).toInt

        val b = secondMultipleInput(1).toInt

        val thirdMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val m = thirdMultipleInput(0).toInt

        val n = thirdMultipleInput(1).toInt

        val apples = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val oranges = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        Result.countApplesAndOranges(s, t, a, b, apples, oranges)
    }
}
