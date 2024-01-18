package Address

fun main() {
    val address1 = Address("SPB", "Zinchenko", 10)
    val address2 = address1.copy()
    val(city, street, numberOfHouse) = address1
    println(address1.city)
    println(address1.street)
    println(address1.numberOfHouse)
    println(address1)
    println(address2)
    println(address1.hashCode())
    println(address2.hashCode())
    println(address1 == address2)




}