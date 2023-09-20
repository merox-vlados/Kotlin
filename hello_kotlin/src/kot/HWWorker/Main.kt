package kot.HWWorker

fun main() {
    val workers = mutableListOf<Worker>()
    workers.add(Seller("Leonid", 25))
    workers.add(Seller("Vladimir", 30))
    workers.add(Seller("Petr", 29))
    workers.add(Programmer("Дмитрий", 25, "Kotlin"))
    workers.add(Programmer("Слава", 21, "Java"))
    workers.add(Director("Nick", 50))

    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
    for( cleaner in cleaners) {
        cleaner.clean()
    }
}

