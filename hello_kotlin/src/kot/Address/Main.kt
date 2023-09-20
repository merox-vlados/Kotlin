package kot.Address

fun main() {
    val address1 = Address("Санкт-Петербург", "Ленинский проспект", 111 )
    val address2 = address1.copy()


    println(address1)
    println(address2)
    println(address1.hashCode())
    println(address2.hashCode())
    println(address1 == address2)

    val (city, street, numberOfHouse) = address1
    println(city)
    println(street)
    println(numberOfHouse)




}