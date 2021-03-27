fun main() {
    val array = intArrayOf(32, 4, 5, 5, 6, 7, 8, 85, 3)
    val k =2
    val m =4
    val swipe = m-k+1
    for (index in 0 until array.size-swipe) {
        if (index >= k) {
            array[index] = array[index+swipe]
        }
    }
    for (i in 0 until array.size - swipe) {
        print("${array[i]}, ")
    }
    
}