package kot.Transport

fun main () {

    travel(object : Transport("Автобус") {
        override fun drive() {
            println("Автобус едет")
        }
    })
}

fun travel(transport: Transport) {
    transport.drive()
}