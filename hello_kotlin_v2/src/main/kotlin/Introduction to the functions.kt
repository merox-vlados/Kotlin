import kotlin.math.min

fun main() {

    println(sort(-1,2,1,2,4,6,8))



//    println(max(5,10))
//    println(string("Danissimo"))
//    println(sum(1,2,34,5))
}




fun sort(numbers: MutableList<Int>): List<Int> {
    for(i in 0 until numbers.size - 1) {
        for(j in 0 until numbers.size - i - 1) {
            if(numbers[j] > numbers[j+1]) {
                var temp = numbers[j]
                numbers[j] = numbers[j+1]
                numbers[j+1] = temp
            }
        }
    }
    return numbers.toList()
}

fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())
fun sort(vararg numbers: Int) = sort(numbers.toMutableList())

//fun sort(number: IntArray): List<Int> {
//    val array = mutableListOf<Int>()
//    for( i in number) {
//        array.add(i)
//    }
//    for(i in 0 until array.size - 1) {
//        for(j in 0 until array.size - i - 1) {
//            if(array[j] > array[j+1]) {
//                var temp = array[j]
//                array[j] = array[j+1]
//                array[j+1] = temp
//            }
//        }
//    }
//    return array.toList()
//}

//fun sort(number: List<Int>): List<Int> {
//    val array = mutableListOf<Int>()
//    for( i in number) {
//        array.add(i)
//    }
//    for(i in 0 until array.size - 1) {
//        for(j in 0 until array.size - i - 1) {
//            if(array[j] > array[j+1]) {
//                var temp = array[j]
//                array[j] = array[j+1]
//                array[j+1] = temp
//            }
//        }
//    }
//    return array.toList()
//}








//fun max(a: Int, b: Int) = if (a > b) a else b
//fun string(str: String) = str.substring(0, min(5, str.length))
//
//fun sum(vararg numbers: Int): Int {
//    var result = 0
//    for(num in numbers) {
//        result += num
//    }
//    return result
//}



