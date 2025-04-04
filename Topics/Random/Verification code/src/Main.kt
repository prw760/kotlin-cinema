fun verificationCode(): String {
    val letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789"
    return (1..10)
        .map { letters.random() }
        .joinToString("")
}