package kot.HWMyRandom

import kotlin.random.Random

class MyRandom {

    companion object {

        fun randomInt(from: Int, to: Int) = (Math.random() * (to - from + 1)).toInt() + from
        fun randomBoolean() = randomInt(0,1) > 0






//        fun randNumber(range: ClosedRange<Int>): Int {
//            return Random.nextInt(range.start, range.endInclusive)
//        }
//
//        fun randBool(): Boolean {
//            return Random.nextBoolean()
//        }
//
//        fun randDayOfWeek(): Week {
//            val values = Week.values()
//            val randomIndex = (Math.random() * values.size).toInt()
//            return values[randomIndex]
//        }


    }
}