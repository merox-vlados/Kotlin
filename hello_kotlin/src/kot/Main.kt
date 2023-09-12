package kot



fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for(i in 0..99) {
        listOfNumbers.add(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter {it % 2 == 0}
    for(i in listOfEvenNumbers) {
        println(i)
    }

    val listOfNames = mutableListOf<String>("Арина","Оксана", "Катя", "Мария", "Агнесса")
    val listOfEvenNames = listOfNames.filter { it.startsWith("А") }
    for(i in listOfEvenNames) {
        println(i)
    }
}

