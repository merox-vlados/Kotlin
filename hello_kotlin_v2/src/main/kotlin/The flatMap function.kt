fun main() {
    val data = mapOf (
        "file1" to listOf(15,22,14,16,19),
        "file2" to listOf(16,-8,34,23,20),
        "file3" to listOf(87,14,56,11,19)
    )
    val average = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
    println(average)


//    val revenueByWeek = listOf(
//        listOf(8,6,5,1,2),
//        listOf(3,6,4,1,2),
//        listOf(8,7,5,9,2),
//        listOf(8,5,1,3,2)
//    )
//
//    val total = revenueByWeek.flatten()
//    val average = total.average()
//    println(average)
}