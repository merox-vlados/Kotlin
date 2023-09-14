package kot

val list: MutableList<Int>? = mutableListOf()


fun main() {
    list?.let {
        with(it) {
            for(i in 0 until 1000) {
                add((Math.random() * 1000).toInt())
            }
            val result = filter { it % 2 == 0 }.take(100)
            for(i in result) {
                println(i)
            }
        }
    }



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

}





