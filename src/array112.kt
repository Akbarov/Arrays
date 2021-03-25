fun main() {
    val array = intArrayOf(432, 2, 31, 1, 1, 3, 45, 43)
    
    for ((index, item) in array.withIndex()) {
        if (index < array.size-1 && item > array[index + 1]) {
             array[index] = array[index+1]
            array[index+1] = item
        }
    }
    print(array.contentToString())

}