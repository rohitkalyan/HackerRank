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

import scala.collection.immutable.BitSet.empty.ordering

object Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    def climbingLeaderboard(ranked: Array[Int], player: Array[Int]): Array[Int] = {
    
    var mutableRanked = ranked
    val result = new Array[Int](player.size)
    for (i <- 0 until player.size){
      mutableRanked = mutableRanked :+ player(i)
      val pos = mutableRanked.distinct.sorted(ordering.reverse).indexOf(player(i))
      result(i) = pos + 1
    }
    
    result
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val rankedCount = StdIn.readLine.trim.toInt

        val ranked = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val playerCount = StdIn.readLine.trim.toInt

        val player = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.climbingLeaderboard(ranked, player)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}
