import java.io._
import java.math._
import java.security._
import java.text._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.mutable._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._
import scala.collection.mutable
import scala.collection.immutable.BitSet.empty.ordering

object Result {
    var count = 1
    var resultArray = ArrayBuffer[Int]()
    
      def rankFunction(rank_arr: Array[Int], ranksFun: Map[Int, Int], pos: Int):Int = {
    for(i <- 0 until rank_arr.size){
      if(!ranksFun.contains(rank_arr(i))){
        ranksFun += (rank_arr(i) -> count)
        count = count + 1
      }
    }
    count = 1
  ranksFun(pos)
  }
  
    def climbingLeaderboard(ranked: Array[Int], player: Array[Int]): Array[Int] = {
    var mutableArray = ranked
    
    for(i <- 0 until player.size){
      mutableArray = mutableArray :+ player(i)
      val sortedArray = mutableArray.distinct.sorted(ordering.reverse)
      var ranks: mutable.Map[Int, Int] = mutable.Map[Int, Int]()
      val newRank: Int = rankFunction(sortedArray, ranks, player(i))
      resultArray += newRank
    }
    resultArray.toArray
    }

}

object Solution {
    def main(args: Array[String]) {
        var printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
        
        var rankedCount = StdIn.readLine.trim.toInt

        var ranked = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        var playerCount = StdIn.readLine.trim.toInt

        var player = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        var result = Result.climbingLeaderboard(ranked, player)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}
 
