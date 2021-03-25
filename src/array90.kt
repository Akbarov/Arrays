fun main() {
    val array = intArrayOf(1, 2, 4, 5, 6, 8, 343)
    val k = 3
    var newArray = IntArray(0)
    for ((index, item) in array.withIndex()) {
        if (index != k) {
            newArray = newArray.plus(item)
        }
    }
    println(newArray.contentToString())

}