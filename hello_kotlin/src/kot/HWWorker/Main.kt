package kot.HWWorker

fun main() {
    val company = listOf<Worker>(Worker("Вася", 18), Programmer("Дмитрий", 25, "Kotlin"))

    for(i in company) {
        i.work()
    }
}