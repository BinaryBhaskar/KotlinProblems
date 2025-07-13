import java.util.*

fun main(args: Array<String>) {
    // Create a mutable list to store the input numbers
    val numberList = mutableListOf<Int>()

    // Use a scanner to read the user input
    val scanner = Scanner(System.`in`)

    repeat(5) {
        val num = scanner.nextInt()
        numberList.add(num)
    }

    numberList.sort()

    for (i in numberList) print("$i ")
}