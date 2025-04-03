package cinema

fun main() {
    println("Cinema:")
    // Print the header row
    print("  ")
    for (i in 1..8) {
        print("$i ")
    }
    println()

    // Print each row with seats
    for (i in 1..7) {
        print("$i ")
        for (j in 1..8) {
            print("S ")
        }
        println()
    }
}