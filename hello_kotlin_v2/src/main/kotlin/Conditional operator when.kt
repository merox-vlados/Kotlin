fun main() {
    val temp = 80
    val state = when {
        temp < 0 -> "�������"
        temp < 100 ->"������"
        else -> "������������"
    }
    println(state)










//    val indexOfMonth = 3
//    val season = when (indexOfMonth) {
//        12,1,2 -> {
//            "����"
//        }
//        in 3..5 -> {
//            "�����"
//        }
//        6,7,8 -> {
//            "����"
//        }
//        9,10,11 -> {
//            "�����"
//        }
//        else -> {
//            "�� �������"
//        }
//    }
//    println(season)
}