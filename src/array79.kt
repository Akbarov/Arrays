fun main() {
    val array = intArrayOf(1, 2, 4, 5, 6, 77, 8)
    val newArray = intArrayOf(0, 1, 2, 4, 5, 6, 77)
    for (index in array.size - 1 downTo 1) {
        array[index] = array[index - 1]
    }
    array[0] = 0
    println(array.contentToString())
}