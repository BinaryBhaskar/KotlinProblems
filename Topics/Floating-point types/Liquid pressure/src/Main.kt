const val GRAVITATIONAL_ACCELERATION : Double = 9.8

fun main() {
    val rho : Double = readln().toDouble()
    val height : Double = readln().toDouble()

    val liquidPressure : Double = rho * GRAVITATIONAL_ACCELERATION * height
    println(liquidPressure)
}