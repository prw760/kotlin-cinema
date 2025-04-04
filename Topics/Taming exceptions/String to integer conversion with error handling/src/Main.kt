import java.lang.NumberFormatException

fun stringToIntLength(input: String): Int {
    try {
        val myInt = input.toInt()
        if (myInt < 0) { return -1 }
    } catch (e: NumberFormatException) {
        return -1
    }
    return input.length
}

fun main(args: Array<String>) {
    val strInput = readLine().toString()
    println(stringToIntLength(strInput))
}