import java.io._
import scala.io._


object Result {

    def hurdleRace(k: Int, height: Array[Int]): Int = {
        val maxi = height.distinct.sorted.last
    if(maxi - k > 0){
      maxi - k
    }
    else{
      0
    }

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

        val n = firstMultipleInput(0).toInt

        val k = firstMultipleInput(1).toInt

        val height = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.hurdleRace(k, height)

        printWriter.println(result)

        printWriter.close()
    }
}
