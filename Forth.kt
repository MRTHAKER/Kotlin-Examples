class Fruits(private val name: String, private val pricePerKg: Int) {
    fun getName(): String =name.toUpperCase()
    fun getPricePerKg():Int=pricePerKg
}
    fun main() {
        var fruits= listOf(Fruits("Banana", 20),Fruits("Orange", 55),Fruits("Mango", 59),Fruits("Apple", 60))
        fruits=fruits.sortedBy { fruits ->fruits.getName() }
        for(i in fruits) {
            if (i.getPricePerKg() in 51..60) {
                println(i.getName())
            }
        }
    }