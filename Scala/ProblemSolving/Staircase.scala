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


    def staircase(n: Int) {
        for (numSymbol <- 0 to n-1){
        val numSpaces: Int = n - numSymbol
        for (i <- 2 to numSpaces){
        print(" ")
        }
        for (j <- 0 to numSymbol){
        print("#")}
        println()
        }}

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        staircase(n)
    }
}
