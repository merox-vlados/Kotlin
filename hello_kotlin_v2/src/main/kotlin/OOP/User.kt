package OOP

class User {
    var age = 0
        set(value) {
            if(value >= 0) {
                field = value
            }
        }
    var name: String? = null
        get() {
            return if(field == null) {
                ""
            } else {
                field
            }
        }

}
