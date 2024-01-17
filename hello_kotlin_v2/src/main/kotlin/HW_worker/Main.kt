package HW_worker

fun main() {
    val worker = Worker("Vasiliy", "Lawyer", 2022)
    worker.work()
    println("Work experience ${worker.experience} year")
    worker.printInfo()

}

fun Worker.printInfo() {
    println("Name: $name, Post: $post, Year: $year")
}