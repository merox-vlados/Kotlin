package HW_Dog


class Dog {
    var name: String? = null
        set(value) {
            field = value?.capitalize()
        }
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var weight: Double = 0.0
        set(value) {
            if (value >= 0.0) {
                field = value
            }
        }

}