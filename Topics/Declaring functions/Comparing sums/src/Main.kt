fun isGreater (val1 : Int, val2 : Int, val3 : Int, val4 : Int) : Boolean {return (val1 + val2 > val3 + val4)}

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}