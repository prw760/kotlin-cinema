import kotlin.random.Random

fun rpgDices(dice1: Int, dice2: Int): Int {
    val roll1 = Random.nextInt(1, dice1 + 1)
    val roll2 = Random.nextInt(1, dice2 + 1)
    return roll1 + roll2
}