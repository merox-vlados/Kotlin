fun main() {
    volParal(5,2)
}

fun volParal(a: Int, b: Int = a, c: Int = a) {
    var volume = a * b * c;
    println(volume)
}



//fun printInfo(lastname: String = "", name: String = "", patronymic: String = "") {
//    if(lastname.isNotEmpty()) {
//        println("Surname: $lastname")
//    }
//    if(name.isNotEmpty()) {
//        println("Name: $name")
//    }
//    if(patronymic.isNotEmpty()) {
//        println("Patronymic: $patronymic")
//    }
//
//}