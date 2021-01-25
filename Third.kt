import java.util.*
class Department(var deptName: String) {
    var personList: MutableList<Person> = mutableListOf()
    fun addPerson(p: Person) {
        personList.add(p)
    }
}
data class Person(var id:Int, var name:String)
fun main() {
    val sc = Scanner(System.`in`)
    println("Enter Name: ")
    val name = sc.next()
    val arpit = Person(1, "Arpit")
    val mahek = Person(2, "Mahek")
    val tejas = Person(3, "Tejas")
    val security = Department("Security")
    security.addPerson(arpit)
    security.addPerson(tejas)
    val android = Department("Android")
    android.addPerson(mahek)
    var departmentList = listOf<Department>(android, security)
    val x = departmentList.filter { it.personList.any { y -> y.name == name } }
    if (x.isEmpty()) {
        println("Person $name doesn't belong here.")
    }else{
        println("Person $name is working at ${x[0].deptName} department.")
    }
}

