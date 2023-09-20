package kot.HWSportsman

fun main() {
    val sportsman = Sportsman()
//    sportsman.callWaterCarrier(object : waterBoy {
//        override fun bringWater() {
//            println("Вода принесена")
//        }
//    })
    sportsman.callWaterCarrier { println("Вода принесена") }
}