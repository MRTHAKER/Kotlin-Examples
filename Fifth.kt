fun main(){
    var target="ABCAAAEEE"
    for (i in target)
        println("$i->${target.filter { it == i}.count()}")
}