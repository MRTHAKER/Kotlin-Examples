fun main(){
    val arr= intArrayOf(5,12,6,3,9,2,10,7,4,11,1,8)
    val target=22
    val map: MutableMap<Int,Int> = mutableMapOf()
    for (i in arr) {
        val element = target - i
        if (arr.contains(element)) {
            map[element]=i
        }
    }
    println(if(map.isEmpty()) "No items from array $arr matched your search" else map)
}

