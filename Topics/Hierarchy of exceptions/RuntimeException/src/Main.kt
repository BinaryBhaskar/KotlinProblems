fun main() {
    try {
        val x = "Hello".toInt()
    } catch(e: RuntimeException) {
        println("Well")
    } catch (e: Exception) {
        println("Wrong")
    }
}