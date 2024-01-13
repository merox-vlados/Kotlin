
//var name: String? = null

var list: MutableList<Int>? = mutableListOf()

fun main() {
    list?.let {
        with(it) {
            for(i in 0..1000) {
                it.add((Math.random() * 100).toInt())
            }
            var result = it.filter { it % 2 == 0 }.take(100)
            for (i in result) {
                println(i)
            }
        }
    }







//    val list = mutableListOf<Int>()
//    with(list) {
//        for(i in 0 until 1000) {
//            add((Math.random() * 100).toInt())
//        }
//
//    }
//
//    val sumOfList = list.sum()
//    val averageOfList = list.average()
//    val maxOfList = list.max()
//    val minOfList = list.min()
//    val firstOfList = list.first()
//    val lastOfList = list.last()
//    println(sumOfList)
//    println(averageOfList)
//    println(maxOfList)
//    println(minOfList)
//    println(firstOfList)
//    println(lastOfList)
//    println("________________")
//    for(i in list) {
//        println(i)
//    }

//    name?.let {
//        if(it.length > 5) {
//            println("34sdf")
//        }
//    }

}