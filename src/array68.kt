fun main() {
    val array = intArrayOf(1, 2, 4, 5, 6, 77, 8)
    val max = array.max()
    val min = array.min()
    var minIndex = 0
    var maxIndex = 0
    for ((index, item) in array.withIndex()) {
        if (item==max){
            maxIndex = index
        }
        if (item == min) {
            minIndex = index
        }
    }
    array[maxIndex] = min!!
    array[minIndex] = max!!
    println(array.contentToString())
}