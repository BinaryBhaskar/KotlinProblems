// import required libraries
import java.util.*

// main function
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // take input
    var n = scanner.nextInt()
    var series = "0"

    //  initialize the first two integers of the Fibonacci series to 0 and 1 respectively
    var t1 = 0
    var t2 = 1

    // Write your "while" loop code here to complete the series
    while (n > 1) {
        series = series + ", $t2"
        val temp = t1
        t1 = t2
        t2 = temp + t1
        n--
    }

    // print the series
    println(series)
}