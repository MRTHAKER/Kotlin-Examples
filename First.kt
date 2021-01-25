fun main() {
    var j = 50
    var i = 50
    for (k in 1..20) {
        if (j >= i) {
            print("$j ")
            j -= 10
            }
        else {
            j = 50
            i -= 10
            println()
            }
        }
}
