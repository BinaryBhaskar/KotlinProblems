fun solution(first: Set<String>, second: MutableList<String>): Boolean {
    val secondSet = second.toSet().toHashSet()
    return first.containsAll(secondSet)
}