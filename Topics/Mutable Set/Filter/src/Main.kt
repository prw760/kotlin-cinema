fun evenFilter(numbers: Set<Int>): Set<Int> {
    val evenNumbers: MutableSet<Int> = mutableSetOf()
    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }
    return evenNumbers
}