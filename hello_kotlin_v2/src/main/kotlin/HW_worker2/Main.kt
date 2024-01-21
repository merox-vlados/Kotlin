package HW_worker2

fun main() {
    val workers = mutableListOf<Worker>()
        workers.add(Worker("Kate", 30))
        workers.add(Programmer("Vlad", 29, "Kotlin"))
        workers.add(Worker("Nikolay", 25))
        workers.add(Worker("Daria", 25))

    for (worker in workers) {
        worker.work()
    }


//    val workers: List<Any> = listOf(
//        Worker("Kate", 30),
//        Programmer("Vlad", 29, "Kotlin"),
//        Worker("Nikolay", 25),
//        Worker("Daria", 25)
//    )
//    for(worker in workers) {
//        when(worker) {
//            is Worker ->
//                worker.work()
//            is Programmer ->
//                worker.work()
//        }
//    }

}