import java.util.*

fun main(args: Array<String>) {
    // Create a mutable list to store the input numbers
    val numberList = mutableListOf<Int>()

    // Use a scanner to read the user input
    val scanner = Scanner(System.`in`)

    // TODO: Extract the integers from the input and add them to the mutable list
    repeat(5) {
        val num = scanner.nextInt()
        numberList.add(num)
    }

    // TODO: Sort the list in ascending order
    numberList.sort()

    // TODO: Iterate through the sorted list and print each number followed by a space.
    for (i in numberList) print("$i ")
}