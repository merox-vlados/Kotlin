package kot



fun main() {
    val numbers = mutableListOf<Int>(5,8,12,-2,6,5)
    val result = sort(8,-6,5,88)
    for(i in result) {
       println(i)
    }

}

fun sort(numbers : MutableList<Int>): List<Int> {
    for(i in 1 until numbers.size) {
        for(j in numbers.size - 1 downTo i) {
            if(numbers[j] < numbers[j - 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j -1]
                numbers[j-1] = temp
            }
        }
    }
    return numbers
}

fun sort(numbers: Array<Int>) = kot.sort(numbers.toMutableList())
fun sort(vararg numbers: Int) = kot.sort(numbers.toMutableList())
