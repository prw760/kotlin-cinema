fun solution(newSet: MutableSet<String>, oldSet: Set<String>): MutableSet<String> {
    for (str in oldSet) {
        if (str.startsWith("A", ignoreCase = true)) {
            newSet.add(str)
        }
    }
    return newSet
}