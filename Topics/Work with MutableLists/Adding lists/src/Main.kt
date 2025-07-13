fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    val completeList = mutableListOf<String>()
    completeList.addAll(firstList)
    completeList.addAll(secondList)
    println(completeList.joinToString(separator = ", "))
}