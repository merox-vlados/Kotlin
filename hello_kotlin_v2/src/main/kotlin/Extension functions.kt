fun main() {

    val list = listOf<Int>()
    myWith(list) {
        sum()
        average()
    }



//    val age = 11
//    if(age.isAgeValid()) {
//        println("Valid")
//    }
//    println(age.isPositive())
//
//    val name = ""
//    if(name.isNotEmpty()) {
//        println("String is not empty")
//    }
//    if(age.isPrimeNumber()) {
//        println("number is prime")
//    } else {
//        println("number is not prime")
//    }

}

fun myWith(list: List<Int>, operation: List<Int>.() -> Unit) {
    list.operation()
}

//fun isAgeValid(age: Int) = age in 6..100
//
//fun Int.isAgeValid() = this in 6..100
//
//fun Int.isPositive() = this >= 0
//
//fun Int.isPrimeNumber() : Boolean {
//    if(this < 1) {
//        return false
//    }
//    for(i in 2 until this) {
//        if(this % i == 0) {
//            return false
//        }
//    }
//    return true
//}