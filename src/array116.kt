fun main() {
    val array = intArrayOf(32, 43, 12, 21, 21, 4, 4, 4, 4, 4, 43)
    var b = IntArray(0) // 1,1,1,2,5,1
    var c = IntArray(0)
    var count = 1

    for (index in array.indices) {

        if (count > 1) {
            count--

        } else {
            for (innerIndex in index + 1 until array.size) {
                if (array[index] != array[innerIndex]) {
                    break
                }
                count++
            }
            b = b.plus(count)
            c= c.plus(array[index])
        }
    }
    println(b.contentToString())
    println(c.contentToString())

}