import kotlin.math.abs
import kotlin.math.min

fun main() {
    val array = arrayOf(1, 2, 4, 5, 6, 77, 8)
    val r = 30
    var minValue = Int.MAX_VALUE
    var index = 0
    for ((counter, item) in array.withIndex()) {
        if (minValue> abs(item-r)){
            minValue = abs(item-r)
            index = counter
        }
    }
    print(index)


}