package kot

import kotlin.random.Random


fun main() {

    val array = mutableListOf<Int>()
    for(i in 0..1000) {
        array.add((Math.random() * 1000).toInt())
    }


    val newArray = array
        .filter { it % 3 == 0 || it % 5 == 0 }
        .map { it * it }
        .sortedDescending()
        .map { "\"$it\"" }


    for(i in newArray) {
        println(i)
    }


//    val array = arrayOf(8,10, -6,45,51)
//    array.
//    val sortedArray = array.sortedDescending()
//    for(i in sortedArray) {
//        println(i)
//    }
}

