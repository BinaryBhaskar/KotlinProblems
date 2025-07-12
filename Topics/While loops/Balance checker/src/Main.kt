import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var transactionsDone = true
    while (scanner.hasNextInt()) {
        val cost = scanner.nextInt()
        if (cost <= balance) {
            balance -= cost
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $cost.")
            transactionsDone = false
        }
    }
    if (transactionsDone) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}
