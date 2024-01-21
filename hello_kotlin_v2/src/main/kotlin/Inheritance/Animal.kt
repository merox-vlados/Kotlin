package Inheritance

open class Animal(val name: String, var weight: Float, val habitat: String) {
    open fun eat() {
        println("Eat food")
    }

    open fun run() {
        println("Run")
    }
}