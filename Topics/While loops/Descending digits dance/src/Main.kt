import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var number = scanner.nextInt()

    while (number > 0) {
        println(number--)
    }
}