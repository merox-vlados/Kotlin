fun main() {
    val arrayEmployee = generateSequence ("Employee №1") {
        val index = it.substring(10).toInt()
        "Employee №${index+1}"
    }
    val arrayEmployeeTake100 = arrayEmployee.take(100)
    for(employee in arrayEmployeeTake100) {
        println(employee)
    }






//    val array = generateSequence {
//        (Math.random() * 100).toInt()
//    }
//    val evenList = array.take(10)
//    for(i in evenList) {
//        println(i)
//    }



//    val array = generateSequence('A') {
//        println("Сгенерировано ${it + 1}")
//        it + 1
//    }
//    val evenList = array.take(10)
//    for(i in evenList) {
//        println(i)
//    }



//    val array = (0..1000).toList()
//    val employees = array.map{"Employee №$it"}
//    val first30 = employees.take(30)
//    val dropFirst30 = employees.drop(30)
//    for(employee in dropFirst30) {
//        println(employee)
//    }
}