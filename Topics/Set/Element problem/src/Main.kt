fun solution(first: Set<String>, second: MutableList<String>): Boolean {
    return second.all { it in first }
}