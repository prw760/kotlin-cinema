fun solution(elements: MutableList<String>, index: Int): MutableList<String> {
    if (index in elements.indices) {
        elements.removeAt(index)
    }
    return elements
}