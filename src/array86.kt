fun main() {
    val array = arrayOf(1, 2, 3, 45, 56, 6, 7, 7, 8, 8, 89, 6)
    val newArray = IntArray(array.size)
    val k = 4
    val n = array.size
    for (i in newArray.indices) {
        newArray[(i+k)%n] = array[i]
    }
    print(newArray.contentToString())
}