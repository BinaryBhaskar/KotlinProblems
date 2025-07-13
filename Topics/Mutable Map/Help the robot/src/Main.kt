fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>) : MutableMap<String, Int> {
    val toPurchase = mutableMapOf<String, Int>()
    toPurchase.putAll(purchases)
    for ((k,v) in addition) {
        toPurchase[k] = (toPurchase[k] ?: 0) + v
    }
    return toPurchase
}