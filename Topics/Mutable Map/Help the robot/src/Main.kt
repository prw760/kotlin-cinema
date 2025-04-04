fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>): MutableMap<String, Int> {
    val result = purchases.toMutableMap()
    for ((product, quantity) in addition) {
        result[product] = quantity + (result[product] ?: 0)
    }
    return result
}