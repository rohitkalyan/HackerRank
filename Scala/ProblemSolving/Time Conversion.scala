import java.io.PrintWriter

object Solution {
    def timeConversion(s: String): String = {
         val splitStr = s.split(":")
         var afterSplit = splitStr(0).toInt
         var str = ""
         if (s.contains("PM")){
         if (afterSplit == 12){
         str = s.dropRight(2)
         }
         else{
         str = afterSplit + 12 + ":" +splitStr(1) + ":" +splitStr(2).dropRight(2)
         }
         }
         else {
         if (afterSplit == 12){
         str = "00" + ":" +splitStr(1) + ":" +splitStr(2).dropRight(2)}
         else{
         str = s.dropRight(2)}}
         str
    }

    def main(args: Array[String]) {
        val scan = scala.io.StdIn

        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = scan.readLine

        val result = timeConversion(s)

        fw.println(result)

        fw.close()
    }
}
