import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val xArray = intArrayOf(32, 3, 5, -6, 78, -5)
    val yArray = intArrayOf(-3, 2, 5, 7, 3, 2)
    var maxRadius = 0.0
    for (index in xArray.indices) {
        if (xArray[index] < 0 && yArray[index] > 0) {
            val length = sqrt(xArray[index].toDouble().pow(2) + yArray[index].toDouble().pow(2))
            if (maxRadius < length) {
                maxRadius = length
            }
        }
    }
    print("max length = $maxRadius")
}