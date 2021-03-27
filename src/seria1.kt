fun main() {
    val n = 10
    var sum = 0
    for (i in 0 until n) {
        val number = readLine()?.toInt()!!
        sum+=number
    }
    print(sum)
}