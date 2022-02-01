import java.io._
import scala.io._
import scala.math._

object Result {

  def designerPdfViewer(h: Array[Int], word: String): Int = {
    var maxi = -1
    for (i <- word){
      val wordAsciiNum = i.toInt
      val index = wordAsciiNum - 97
      if(h(index) > maxi){
        maxi = h(index)
      }
    }
    word.length * maxi
  }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val h = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val word = StdIn.readLine

        val result = Result.designerPdfViewer(h, word)

        printWriter.println(result)

        printWriter.close()
    }
}
