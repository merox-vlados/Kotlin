package kot.HWSportsman

class Sportsman  {
    fun callWaterCarrier(waterBoy: waterBoy) {
        waterBoy.bringWater()
    }

    inline fun callWaterCarrier(bringWater: () -> Unit) {
        bringWater()
    }
}