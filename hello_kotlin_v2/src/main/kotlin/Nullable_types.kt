
//private var name: String? = "null"

private var str1: String? = null
private var str2: String? = null
private var str3: String? = null
fun main() {
//     val length = name?.length?:0
//     println(length)
     str1 = "sdfo"
     str2 = "sdfoos"
     str3 = "sdfosdf"

     val result: Int? = (str1?.length?:0).plus(str2?.length?:0).plus(str3?.length?:0)

     println(result)


}