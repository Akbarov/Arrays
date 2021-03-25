fun main() {
    val array = arrayOf(7, 4, 2, 3, 1, 4, 5, 2, 7, 4)
    for ((index, item) in array.withIndex()) {
        var shouldPrint = true
        for (innerIndex in 0 until index) {
            if (item == array[innerIndex]) {
                shouldPrint = false
                break
            }
        }
        if (shouldPrint)
            println(item)
    }

}