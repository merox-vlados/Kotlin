package kot



fun main() {
    volume(5, 6)
}

fun volume(length: Int , width: Int = length, height: Int = length) {
    println(length * width * height)
}
