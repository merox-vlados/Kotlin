package kot.Student

fun main() {
    val student1 = Student("Иван", "Иванов", "412344")
    val student2 = student1.copy(id = "2342")
//    val (name, lastName, id) = student1

    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2)
    println(student1 === student2)

}