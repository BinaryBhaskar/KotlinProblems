class BankAccount constructor(deposited : Long, withdrawn : Long) {
    val deposited = deposited
    val withdrawn = withdrawn
    val balance = deposited-withdrawn
}