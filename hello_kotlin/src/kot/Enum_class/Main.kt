package kot.Enum_class

import kot.Enum_class.Month.*
import kot.Enum_class.Season.*


fun main() {
    val month: Month = SEPTEMBER
    val season =  when(month) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH,APRIL,MAY, -> SPRING
        JUNE,JULY,AUGUST -> SUMMER
        SEPTEMBER,OCTOBER,NOVEMBER -> AUTUMN
    }
    println(month.tempAverage)
    println(season)

}
