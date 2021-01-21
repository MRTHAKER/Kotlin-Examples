object Third {
    @JvmStatic
    fun main(args: Array<String>) {
        var j = 50
        val n = 5
        var i = 50
        while (i >= n) {
            if (j >= i) {
                print(j)
                print(" ")
                j -= 10
            } else {
                j = 50
                i -= 10
                println()
            }
        }
    }
}