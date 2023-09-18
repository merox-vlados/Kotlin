package kot.HWDog

import java.util.*

class Dog {
    var name = ""
        get() {
            return field.lowercase()
                .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }
    var age = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var weight = 0f
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}