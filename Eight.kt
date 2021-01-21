fun main(){
    var str="ab9cd11ed3ka44"
    var k=str.map { it.toChar() in '0'..'9' }
    var idx=0
    var sum=0
    for(i in str){
        if(idx==str.length-1)
            break
        else if(k[idx] && k[idx+1]){
            var ab = "$i${str[idx+1]}"
            sum+=Integer.parseInt(ab)
        }
        else if(k[idx]){
            sum += Integer.parseInt("$i")
        }
        idx++
    }
    println(sum)
}