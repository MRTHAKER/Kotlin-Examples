fun main(){
    val str="ab9cd11ed3ka45"
    var sum=0
    var i=0
    while(i in str.indices){
        if(str[i] in '0'..'9' && str[i+1] in '0'..'9'){
            sum+=Integer.parseInt("${str[i]}${str[i+1]}")
            i += 1
        }
        else if(str[i] in '0'..'9'){
            sum+=Integer.parseInt("${str[i]}")
        }
        i++
    }
    println(sum)
}