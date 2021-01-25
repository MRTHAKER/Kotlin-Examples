import java.util.Scanner

    fun main() {
        val sc = Scanner(System.`in`)
        println("Enter Number or name of month: ")
        val search =sc.nextLine()
        val x=when(search.toUpperCase()){
                "1","JAN"->"January"
                "2","FEB"->"February"
                "3","MAR"->"March"
                "4","APR"->"April"
                "5","MAY"->"May"
                "6","JUN"->"June"
                "7","JUL"->"July"
                "8","AUG"->"August"
                "9","SEP"->"September"
                "10","OCT"->"October"
                "11","NOV"->"November"
                "12","DEC"->"December"
            else -> "Invalid Input"
            }
        println(x)
        }