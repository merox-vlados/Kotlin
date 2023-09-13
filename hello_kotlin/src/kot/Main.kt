package kot


fun main() {
    val data = mapOf(
        "file1" to listOf(15,20,45,15,12),
        "file2" to listOf(35,-20,45,15,12),
        "file3" to listOf(15,40,45,15,72)
    )
    val average = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
    println(average)


//    val revenueByWeek = listOf(
//        listOf(8,6,5,1,2),
//        listOf(4,7,5,8,2),
//        listOf(8,7,5,1,2),
//        listOf(8,5,5,1,2)
//    )
//    val total = revenueByWeek.flatten()
//
//    val average = total.average()
//    println(average)

}

