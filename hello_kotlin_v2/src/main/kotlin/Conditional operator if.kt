fun main() {
   var count = 600
   val food = if (count > 500) {
       count -= 500
       "Пицца"
    } else if (count > 300) {
       count -= 300
        "Шаурма"
    } else {
       count -= 30
        "Доширак"
    }
    println("Вы можите позволить себе купить следующий продукт: $food")




//    val a = 50
//    if(a < 40) {
//        println("Меньше 40")
//    } else if (a < 60) {
//        println("Больше 40, но меньше 60")
//    } else {
//        println("Больше либо равно")
//    }
}