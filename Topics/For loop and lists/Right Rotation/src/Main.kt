fun main() {
    val numOfElements = readln().toInt()
    val listOfElements = mutableListOf<Int>()
    repeat (numOfElements) {
        val num = readln().toInt()
        listOfElements.add(num)
    }
    val rotation = (readln().toInt())%listOfElements.size

    val rotatedList = mutableListOf<Int>()
    for (i in listOfElements.indices) {
        rotatedList.add(listOfElements[(listOfElements.size-rotation+i)%listOfElements.size])
    }
    println(rotatedList.joinToString(separator = " "))
}