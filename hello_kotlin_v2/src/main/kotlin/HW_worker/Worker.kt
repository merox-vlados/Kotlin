package HW_worker

import java.time.LocalDate

class Worker(val name: String, val post: String, val year: Int) {

    val experience: Int
        get() = LocalDate.now().year - year
    fun work() {
        println("I work")
    }
}