package HW_worker2

class Programmer(name: String, age: Int, val languageProgramming: String): Worker(name, age) {

    override fun work() {
        println("I'm writing code in $languageProgramming ")
    }

}