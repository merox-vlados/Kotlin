package HW_worker2

open class Worker(val name: String, val age: Int) {
    open fun work() {
        println("I work ")
    }
}