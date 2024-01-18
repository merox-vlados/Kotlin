package Student

fun main() {
    val student1 = Student("Ivan", "Ivanov", "2211311")
    val student2 = student1.copy()
//    val (name, lastName, id) = student1
//    println(name)
//    println(lastName)
//    println(id)
    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2)
    println(student1 === student2)
}