package Cat

class Cat(val name: String, val age: Int, val weigth: Float = 0f) {

    val isOld: Boolean
        get() = age >= 12
    fun printInfo() {
        println("Nickname: $name, Age: $age, Weight: $weigth")
    }

}