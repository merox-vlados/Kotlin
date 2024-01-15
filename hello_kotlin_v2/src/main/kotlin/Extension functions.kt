fun main() {
    val age = 5
    if(age.isAgeValid()) {
        println("Valid")
    }
    println(age.isPositive())

    val name = ""
    if(name.isNotEmpty()) {
        println("String is not empty")
    }
}

//fun isAgeValid(age: Int) = age in 6..100

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.isPrimeNumber() = run {
    if(this < 1 ) {
        false
    }
    for(i in 2 until this) {
        if(this % i == 0) {
            false
        }
    }
    true
}