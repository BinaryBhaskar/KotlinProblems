// Necessary import statements
import java.lang.Exception
import java.lang.NumberFormatException

// Function to convert String to Integer and calculate its length
fun stringToIntLength(input: String): Int {
    try {
        input.toInt()
        return input.length
    } catch(e : NumberFormatException) {
        return -1
    }
}

// Entry point of the program
fun main(args: Array<String>) {
    val strInput = readLine().toString()

    // Call the previously declared function with `strInput` as an argument
    println(stringToIntLength(strInput))
}