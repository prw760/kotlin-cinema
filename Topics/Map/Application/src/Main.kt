fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    return shoppingList.sumOf { product -> priceList[product] ?: 0 }
}