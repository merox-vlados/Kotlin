package kot

//val list: MutableList<Int>? = mutableListOf()


fun main() {



    val list = (0..100).toList()
    listModify(list) {
        println(it.sum())
    }

}

inline fun listModify(list: List<Int>, operator: (List<Int>) -> Unit) {
    operator(list)
}

//list?.let {
//    with(it) {
//        for(i in 0 until 1000) {
//            add((java.lang.Math.random() * 1000).toInt())
//        }
//        val result = filter { it % 2 == 0 }.take(100)
//        for(i in result) {
//            println(i)
//        }
//    }
//}



//fun modifyString(string: String, modify: (String) -> String) : String {
//    return modify(string)
//}





//    val list = mutableListOf<Int>()
//    with(list) {
//        for(i in 0 until 1000) {
//            add((Math.random() * 100).toInt())
//        }
//        println(sum())
//        println(average())
//        println(max())
//        println(min())
//        println(first())
//        println(last())
//    }





