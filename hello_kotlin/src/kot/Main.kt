package kot



fun main() {
    val array = arrayOfNulls<Int?>(301);
    for((index, i) in (300..600).withIndex()) {
        array[index] = i
    }

    for((index, i) in (600 downTo  300).withIndex()) {
        array[index] = i
        if(i % 5 == 0) {
            println(array[index])
        }
    }
}