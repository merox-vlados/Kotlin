import kotlin.random.Random

fun main() {
    val firstNames = listOf<String>("Jon", "Tom", "Alice", "Margaret", "Mike")
    val lastName = listOf<String>("Brown", "Crown", "Gonzo", "Lobenko", "Kruglov")
    val firstAndLastNames = firstNames.zip(lastName)
    for(i in firstAndLastNames) {
        println("Name: ${i.first} Surname: ${i.second}")
    }


//    val arrayNames = mutableListOf<String>()
//    val phoneNumbers = mutableListOf<Long>()
//    for(i in 1..1000) {
//        arrayNames.add("Name $i")
//        phoneNumbers.add(79_000_000_000 + Random.nextLong(1_000_000_000))
//
//    }
//    val users = arrayNames.zip(phoneNumbers)
//    for (user in users) {
//        println("Name: ${user.first}, Phone: ${user.second}")
//    }
}