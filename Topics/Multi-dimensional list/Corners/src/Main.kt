fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val strings = readln().split(' ').toMutableList()
        inputList.add(strings)
    }
    // write your code here
    println("${inputList.first().first()} ${inputList.first().last()}")
    println("${inputList.last().first()} ${inputList.last().last()}")
}