fun solution(numbers1: Set<Int>, numbers2: Set<Int>): Int {
    return numbers1.subtract(numbers2).size
}