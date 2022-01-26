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

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    def dayOfProgrammer(y: Int): String = {
    // Write your code here
if(y>=1700 && y<=1917){
if(y%4==0){
  "12.09."+y
}
else{
"13.09."+y
}
}
else{
if(y==1918){
"26.09."+y
}
else{
if(y%400==0){
"12.09."+y
}
else if(y%4==0 && y%100!=0){
"12.09."+y
}
else{
"13.09."+y
}
}
}
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val year = StdIn.readLine.trim.toInt

        val result = Result.dayOfProgrammer(year)

        printWriter.println(result)

        printWriter.close()
    }
}
