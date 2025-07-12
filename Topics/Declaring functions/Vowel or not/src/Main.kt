fun isVowel(char: Char) : Boolean {
    return char.lowercaseChar() in listOf('a','e','i','o','u')
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}