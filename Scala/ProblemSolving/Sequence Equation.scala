import java.io._
import java.math._
import java.security._
import java.text._
// import java.util._
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

  def permutationEquation(p: Array[Int]): Array[Int] = {
    var list = List[Int]()
    for(i <- 1 to p.size){
     val index1 = p.indexOf(i) + 1
     val index2 = p.indexOf(index1) + 1
      list ::= index2
    }
    list.reverse.toArray
  }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val p = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.permutationEquation(p)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}
