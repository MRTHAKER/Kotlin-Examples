fun main()=println(findTheOne(38))
fun findTheOne(x :Int):Int= if((x/10)==0)x else findTheOne((x/10)+(x%10))
