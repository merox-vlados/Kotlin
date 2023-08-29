package kot



fun main() {
    val perimeter: (Int, Int) -> Int = { a,b -> (a+b) * 2}
    println(perimeter(5,6))
    val name: (String) -> Unit = { println("Hello, $it!")}
    name("Vlad")
    val sort: (Array<Int>) -> Array<Int> = {
        for(i in it.size - 2 downTo 0) {
            for(j in 0..1) {
                if(it[j] < it[j+1]) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }
    val sortedArray = sort(arrayOf(-56,3,10,-2,34,-33))
    for(i in sortedArray) {
        println(i)
    }
}


