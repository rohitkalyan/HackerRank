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
    var sum = 0
    var res = Array[Int]()

    
    def gradingStudents(grades: Array[Int]): Array[Int] = {
      
        grades.foreach(element => {
            if (element.equals(0)){
            res :+= element
            }
            else{
            val reminder = element % 10
            if (reminder < 6){
            sum = 5 - reminder
            }
            else{
                sum = 10 - reminder
            }
            if (element > 37) {
                if (sum < 3) {
            
                          res :+= element + sum

                }
                else {
                
                          res :+= element

                }
            }
            else {
                
                          res :+= element

            }
            }
        })
                res
        }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val gradesCount = StdIn.readLine.trim.toInt

        val grades = Array.ofDim[Int](gradesCount)

        for (i <- 0 until gradesCount) {
            val gradesItem = StdIn.readLine.trim.toInt
            grades(i) = gradesItem
        }

        val result = Result.gradingStudents(grades)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}
