
fun main() {
    val sum: (Int, Int) -> Int = {a, b -> a + b}
    println(sum(2,10))
    val square: (Int) -> Int = {it * it}
    println(square(5))
    val perimeter: (Int, Int) -> Int = {a, b -> (a+b) * 2}
    println(perimeter(2,5))
    val name: (String) -> String = {"Hello, $it!"}
    println(name("Vlad"))
    val sort: (Array<Int>) -> Array<Int> = {
        for( i in it.size - 2 downTo 0) {
             for (j in 0 until i) {
                 if(it[j] > it[j+1]) {
                     val temp = it[j]
                     it[j] = it[j+1]
                     it[j+1] = temp
                 }
             }
        }
        it
    }
    val sortedArray = sort(arrayOf(2,5,1,-1,6,3,7))
    println(sortedArray.joinToString())

}