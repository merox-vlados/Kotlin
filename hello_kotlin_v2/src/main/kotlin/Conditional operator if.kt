fun main() {
   var count = 600
   val food = if (count > 500) {
       count -= 500
       "�����"
    } else if (count > 300) {
       count -= 300
        "������"
    } else {
       count -= 30
        "�������"
    }
    println("�� ������ ��������� ���� ������ ��������� �������: $food")




//    val a = 50
//    if(a < 40) {
//        println("������ 40")
//    } else if (a < 60) {
//        println("������ 40, �� ������ 60")
//    } else {
//        println("������ ���� �����")
//    }
}