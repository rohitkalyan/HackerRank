import java.io._
import scala.io._

object Result {

  def utopianTree(n: Int): Int = {
    var h = 0
    for(i <- 0 to n){
      if(i == 0){
        h = 1
      }
      else if(i == 1){
        h = h + 1
      }
      else if(i %2 == 0){
        h = h + 1
      }
      else{
        h = h * 2
      }
    }
    h
  }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val t = StdIn.readLine.trim.toInt

        for (tItr <- 1 to t) {
            val n = StdIn.readLine.trim.toInt

            val result = Result.utopianTree(n)

            printWriter.println(result)
        }

        printWriter.close()
    }
}
