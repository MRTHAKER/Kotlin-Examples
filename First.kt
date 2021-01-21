fun main(){
    var j = 50
    val n = 5
        var i = 50
        while (i >= n) {
            if (j >= i) {
                print(j)
                print(" ")
                j = j - 10
            } else {
                j = 50
                i = i - 10
                println()
            }
        }
    }