fun romanToInt(s: String): Int {
    val map = mapOf(
        'M' to 1000,
        'D' to 500,
        'C' to 100,
        'L' to 50,
        'X' to 10,
        'V' to 5,
        'I' to 1
    )

    var sum = 0
    var lastDigit = 0

    for (i in s.lastIndex downTo 0) {
        val currentDigit = map[s[i]] ?: 0
        if (currentDigit < lastDigit) {
            sum -= currentDigit
        } else {
            sum += currentDigit
        }
        lastDigit = currentDigit
    }

    return sum
}