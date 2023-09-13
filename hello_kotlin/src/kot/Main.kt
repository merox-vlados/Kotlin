package kot


fun main() {

    val array = mutableListOf<String>(
        "Годенко Владислав",
        "Ляшко Родион",
        "Гаджиев Рамин",
        "Черепанов Родион",
        "Зяблицкий Максим")
    val arrayOfLastNames = array.map{it.substringBefore(" ")}
    val arrayOfNames = array.map{it.substringAfter(" ")}
    val users = arrayOfLastNames.zip(arrayOfNames)
    for(user in users) {
        println("${user.first} ${user.second}")
    }




//    val names = mutableListOf<String>()
//    val phones = mutableListOf<Long>()
//    for(i in 0..1000) {
//        names.add("Имя$i")
//        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
//    }
//    val users = names.zip(phones)
//    for(user in users) {
//        println("Имя: ${user.first} Телефон: ${user.second}")
//    }
}

