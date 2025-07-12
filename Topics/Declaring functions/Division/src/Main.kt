fun divide (dividend : Long, divisor : Long) : Double {return dividend.toDouble() / divisor.toDouble()}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}