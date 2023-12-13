fun main() {
    val temp = 80
    val state = when {
        temp < 0 -> "Твердое"
        temp < 100 ->"Жидкое"
        else -> "Газообразное"
    }
    println(state)










//    val indexOfMonth = 3
//    val season = when (indexOfMonth) {
//        12,1,2 -> {
//            "Зима"
//        }
//        in 3..5 -> {
//            "Весна"
//        }
//        6,7,8 -> {
//            "Лето"
//        }
//        9,10,11 -> {
//            "Осень"
//        }
//        else -> {
//            "Не найдено"
//        }
//    }
//    println(season)
}