import java.io.File.separator
import kotlin.time.Duration.Companion.seconds

fun main() {
    val data = mapOf (
        "January" to listOf(100, 100, 100, 100),
        "February" to listOf(200, 200, -190, 200),
        "March" to listOf(300, 180, 300, 100),
        "April" to listOf(250,-250, 100, 300),
        "May" to listOf(200, 100, 400, 300),
        "June" to listOf(200, 100, 300, 300)
    )

    printInfo(data)

}

fun printInfo(map: Map<String, List<Int>>) {
    val clearData = map.filter { it.value.all { it >= 0 }}
    val revenueByWeek = clearData.flatMap { it.value }.average()
    println("Average weekly revenue: $revenueByWeek")
    val revenueByMonth = clearData.map { (key,value) ->
        val sumByMonth = value.sum()
        key to sumByMonth
    }
    println("Average revenue per month: ${revenueByMonth.map { it.second }.average()}")
    val maxRevenueByMonth = revenueByMonth.maxBy { it.second }.second
    println("Maximum revenue per month: $maxRevenueByMonth")
    val maxRevenueMonth = revenueByMonth.maxBy { it.second }.first
    println("The maximum revenue was in the following months: $maxRevenueMonth")
    val minRevenueByMonth = revenueByMonth.minBy { it.second }.second
    println("Minimum revenue in months: $minRevenueByMonth")
    val minRevenueMonth = revenueByMonth.minBy { it.second }.first
    println("The minimum revenue was in the following months: $minRevenueMonth")
    val errorDate = map.filter { it.value.any {it < 0} }.toList()
    println("Errors occurred in the following months: ${errorDate.joinToString { it.first }}")


}

