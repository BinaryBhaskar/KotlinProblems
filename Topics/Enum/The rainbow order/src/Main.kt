enum class Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }

fun main(args: Array<String>) = println(Rainbow.valueOf(readln().uppercase()).ordinal + 1)