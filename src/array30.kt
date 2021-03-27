fun main() {
    val array = intArrayOf(1,2,3,4,5,6,4,3,12,1)
    var counter = 0
    for (index in 0 until array.size-1) {
        if (array[index] > array[index + 1]) {
            println(index)
            counter++
        }
    }
    println("Total count = $counter")
}