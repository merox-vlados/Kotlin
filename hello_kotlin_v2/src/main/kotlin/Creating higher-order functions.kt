fun main() {
    val mutableList = mutableListOf<Int>()
    with(mutableList) {
        for(i in 0..100) {
            add((Math.random() * 100).toInt())
        }
    }
    val changeList = changeList(mutableList) {it.sorted()}
    for(i in changeList) {
        println(i)
    }


//    val result = modifyString("Hello world!") { it.toUpperCase() }
//    println(result)
}

inline fun changeList (mutableList: MutableList<Int>, modify: (mutable: MutableList<Int>) -> List<Int> ): List<Int> {
    return modify(mutableList)
}

//fun modifyString(string: String, modify: (String) -> String) : String {
//    return modify(string)
//}