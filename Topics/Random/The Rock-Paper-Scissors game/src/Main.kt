import kotlin.random.Random
import kotlin.random.nextInt

fun makeDecision(): String {
    val myDecision = Random.nextInt(1..3)
    return when (myDecision) {
        1 -> "Rock"
        2 -> "Paper"
        3 -> "Scissors"
        else -> ""
    }
}