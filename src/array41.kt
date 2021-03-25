import kotlin.math.abs
import kotlin.math.min

fun main() {
    val array = arrayOf(1, 2, 4, 5, 6, 77, 8)
    var maxSum = Int.MIN_VALUE
    var maxIndex = 0
   for (index in 1 until array.size){
       val temp = array[index]+array[index-1]
       if (maxSum<temp){
           maxSum = temp
           maxIndex = index
       }
   }
    println("indexlar ${maxIndex-1} va $maxIndex")



}