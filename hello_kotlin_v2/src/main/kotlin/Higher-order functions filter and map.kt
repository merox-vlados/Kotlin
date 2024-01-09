import kotlin.random.Random

fun main() {

    val randomNumbers = mutableListOf<Int>()
    for(i in 0..999) {
        randomNumbers.add(Random.nextInt(0,1001))
    }

    val randomNumbersDividedFiveOrThree = randomNumbers.filter { it % 5 == 0 || it % 3 == 0 }

    val randomNumbersDoubled = randomNumbersDividedFiveOrThree.map {it * it}

    val randomNumbersSortedDescending = randomNumbersDoubled.sortedDescending()

    val randomNumberConvertToString = randomNumbersSortedDescending.map { "$it" }

    for(number in randomNumberConvertToString) {
        println(number)
    }



//    val array = arrayOf(8,1,-1,2,-5,23,11,3)
//    val sortedArray = array.sorted()
//    for(i in sortedArray) {
//        println(i)
//    }
//    println("----------------------------------")
//    val sortedArrayDescending = array.sortedDescending()
//    for(i in sortedArrayDescending) {
//        println(i)
//    }

//    val numbers = (0..100).toList()
//    val employees = numbers.map { "Employee ¹$it" }
//    for(employee in employees) {
//        println(employee)
//    }



//    val doubledNumbers = numbers.map{ it * 2}
//    for(i in doubledNumbers) {
//        println(i)
//    }


//    val listOfNames = listOf<String>("Alice", "Jim", "Sara", "Anna", "Tommy", "Amanda")
//    val listOfNameWithA = listOfNames.filter { it.startsWith("A") }
//    for(i in listOfNameWithA) {
//        println(i)
//    }


//    val listOfNumbers = mutableListOf<Int>()
//    for(i in 0..99) {
//        listOfNumbers.add(i)
//    }
//    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
//    for (i in listOfEvenNumbers) {
//        println(i)
//    }
}