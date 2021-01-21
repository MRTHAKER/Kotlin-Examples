fun main(){
    var st="jvkotlinandroidreactflutter"
    for(i in st){
        if(st.filter { it==i }.count()>=2){
            println("First Repeated Character is $i")
            break
        }
    }
}