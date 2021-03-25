fun main() {
    val array = arrayOf(7, 4, 2, 3, 1, 4, 5, 2, 7, 4)
    var innerArray = IntArray(0)
    for ( item in array) {
        if (item !in innerArray) {
          innerArray =  innerArray.plus(item)
        }
    }

    println(innerArray.joinToString(prefix = "{",postfix = "}",separator = "\n",))

}