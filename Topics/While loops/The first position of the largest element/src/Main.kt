import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var largestPosition = 1
    var position = 1
    var largestNumber = scanner.nextInt()
    while (scanner.hasNextInt()) {
        position++
        val x = scanner.nextInt()
        if (x > largestNumber) {
            largestNumber = x
            largestPosition = position
        }
    }
    println("$largestNumber $largestPosition")
}