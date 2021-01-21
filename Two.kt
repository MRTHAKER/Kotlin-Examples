import java.time.Month
import java.util.*

    fun main() {
        val sc = Scanner(System.`in`)
        println("Enter Number or name of month: ")
        var search : String = sc.next()
        search.toUpperCase()
        when(search){
                "1","JAN"->println("January")
                "2","FEB"->println("January")
                "3","MAR"->println("January")
                "4","APR"->println("January")
                "5","MAY"->println("January")
                "6","JUN"->println("January")
                "7","JUL"->println("January")
                "8","AUG"->println("January")
                "9","SEP"->println("January")
                "10","OCT"->println("January")
                "11","NOV"->println("January")
                "12","DEC"->println("January")
            else -> println("Invalid Input")
            }
        }