package cinema

fun main() {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seatsPerRow = readLine()!!.toInt()

    val cinemaSeats = MutableList(rows) { MutableList(seatsPerRow) { "S" } }
    var currentIncome = 0
    var purchasedTickets = 0
    val totalSeats = rows * seatsPerRow
    val totalIncome = if (totalSeats <= 60) {
        totalSeats * 10
    } else {
        val frontRows = rows / 2
        val backRows = rows - frontRows
        frontRows * seatsPerRow * 10 + backRows * seatsPerRow * 8
    }

    var exit = false
    while (!exit) {
        println("\n1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")
        when (readLine()!!) {
            "1" -> {
                println("\nCinema:")
                printHeader(seatsPerRow)
                printCinemaSeats(cinemaSeats)
            }
            "2" -> {
                var valid = false
                var chosenRow = 0
                var chosenSeat = 0
                while (!valid) {
                    println("\nEnter a row number:")
                    chosenRow = readLine()!!.toInt()
                    println("Enter a seat number in that row:")
                    chosenSeat = readLine()!!.toInt()

                    if (chosenRow !in 1..rows || chosenSeat !in 1..seatsPerRow) {
                        println("\nWrong input!")
                        continue
                    }
                    if (cinemaSeats[chosenRow - 1][chosenSeat - 1] == "B") {
                        println("\nThat ticket has already been purchased!")
                        continue
                    }
                    valid = true
                }

                val ticketPrice = if (totalSeats <= 60) {
                    10
                } else {
                    val frontHalf = rows / 2
                    if (chosenRow <= frontHalf) 10 else 8
                }
                println("\nTicket price: \$$ticketPrice")
                cinemaSeats[chosenRow - 1][chosenSeat - 1] = "B"
                currentIncome += ticketPrice
                purchasedTickets++
            }
            "3" -> {
                val percentage = (purchasedTickets.toDouble() / totalSeats) * 100
                println("\nNumber of purchased tickets: $purchasedTickets")
                println("Percentage: ${"%.2f".format(percentage)}%")
                println("Current income: \$$currentIncome")
                println("Total income: \$$totalIncome")
            }
            "0" -> exit = true
        }
    }
}

fun printHeader(seatsPerRow: Int) {
    print("  ")
    for (seat in 1..seatsPerRow) {
        print("$seat ")
    }
    println()
}

fun printCinemaSeats(cinemaSeats: MutableList<MutableList<String>>) {
    for ((index, row) in cinemaSeats.withIndex()) {
        print("${index + 1} ")
        println(row.joinToString(" "))
    }
}













/*

package cinema

fun main() {
    // Read room dimensions
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seatsPerRow = readLine()!!.toInt()

    // Build the seating arrangement initialized with 'S'
    val cinemaSeats = MutableList(rows) { MutableList(seatsPerRow) { "S" } }

    var exit = false
    while (!exit) {
        println("\n1. Show the seats")
        println("2. Buy a ticket")
        println("0. Exit")
        when (readLine()!!) {
            "1" -> {
                println("\nCinema:")
                printHeader(seatsPerRow)
                printCinemaSeats(cinemaSeats)
            }
            "2" -> {
                println("\nEnter a row number:")
                val chosenRow = readLine()!!.toInt()
                println("Enter a seat number in that row:")
                val chosenSeat = readLine()!!.toInt()

                // Calculate ticket price
                val totalSeats = rows * seatsPerRow
                val ticketPrice = if (totalSeats <= 60) {
                    10
                } else {
                    val frontHalf = rows / 2
                    if (chosenRow <= frontHalf) 10 else 8
                }
                println("\nTicket price: \$$ticketPrice")
                // Mark the chosen seat as booked (adjust indices)
                cinemaSeats[chosenRow - 1][chosenSeat - 1] = "B"
            }
            "0" -> exit = true
        }
    }
}

fun printHeader(seatsPerRow: Int) {
    print("  ")
    for (seat in 1..seatsPerRow) {
        print("$seat ")
    }
    println()
}

fun printCinemaSeats(cinemaSeats: MutableList<MutableList<String>>) {
    for ((index, row) in cinemaSeats.withIndex()) {
        print("${index + 1} ")
        println(row.joinToString(" "))
    }
}


 */