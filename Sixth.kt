fun main(){
    var st="javakotlinandroidreactflutter"
    for(i in st){
        if(st.filter { it==i }.count()==1){
            println("First Non Repeating Character is $i")
            break
        }
    }
}