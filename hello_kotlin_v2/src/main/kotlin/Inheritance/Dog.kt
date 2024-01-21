package Inheritance

class Dog(weight: Float): Animal(name = "Dog", weight, "land")  {
    override fun eat() {
        println("eating a bone")
    }

}