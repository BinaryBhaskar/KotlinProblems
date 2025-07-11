fun main() {
    val repetitions : Int = readln().toInt()
    var positives : Int = 0
    repeat(repetitions) {
        if (readln().toInt() > 0) {positives++}
    }
    println(positives)
}