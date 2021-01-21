import java.util.*

class Department {
    var deptName: String? = null
    val personList: ArrayList<Person>
    fun setPerson(p: Person) {
        personList.add(p)
    }
    init {
        personList = ArrayList()
    }
}
class Person {
    var id = 0
    lateinit var name: String
}
fun main() {
    var PersonList: ArrayList<Person>
    val dep = ArrayList<Department>()
    val sc = Scanner(System.`in`)
    println("Enter Name: ")
    val name = sc.next()
    sc.close()
    val arpit = Person()
    arpit.id = 1
    arpit.name = "Arpit"
    val mahek = Person()
    mahek.id = 2
    mahek.name = "Mahek"
    val tejas = Person()
    tejas.id = 3
    tejas.name = "Tejas"
    val security = Department()
    security.deptName = "Security"
    security.setPerson(arpit)
    security.setPerson(tejas)
    val android = Department()
    android.deptName = "Android"
    android.setPerson(mahek)
    dep.add(android)
    dep.add(security)
    var flag = false
    for (d in dep) {
        PersonList = d.personList
        for (p in PersonList) {
            if (p.name.equals(name, ignoreCase = true)) {
                println("Person named " + name + " is working in Department " + d.deptName)
                flag = true
            }
        }
    }
    if (!flag) {
        println("Person:$name not found")
    }
}