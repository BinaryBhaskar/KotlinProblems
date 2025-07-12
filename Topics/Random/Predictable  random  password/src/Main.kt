import kotlin.random.Random
import kotlin.random.nextInt

fun generatePredictablePassword(seed: Int): String {
    var randomPassword = ""
    val myGenerator = Random(seed)
    for (i in 1..10) {
        val pwdGenerated = myGenerator.nextInt(33..126).toChar()
        randomPassword = randomPassword + pwdGenerated
    }
    return randomPassword
}