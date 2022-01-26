import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the miniMaxSum function below.
    def miniMaxSum(arr: Array[Long]) {
    val numSort = arr.toList.sum
    val t = arr.toList.sorted
/*    println(t)
    println(numSort)
    println(t(arr.size - 1))
    println(t(0))*/
    if(arr.size > 0){
    val min = numSort - t(arr.size - 1)
    val max = numSort - t(0)
    println(min + " "+ max)}
    }


    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val arr = stdin.readLine.split(" ").map(_.trim.toLong)
        miniMaxSum(arr)
    }
}
