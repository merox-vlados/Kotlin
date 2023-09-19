package kot.HWEmployee

import java.time.LocalDateTime


class Worker (val name: String, val position: String, var startYear: Int ) {

    val experience: Int
        get() = LocalDateTime.now().year - startYear
    fun work() {
        println("Работаю")
    }
}