/**
 * Need to go through every digit:
 * 1. Take modulo by 10 to get the next digit and do a division by 10 to drop the last digit
 * 2. Do a division by 5 on the digit to know how much fives need to get (V is one 5, X is two 5s)
 * 3. Take a modulo from the digit by 5 to know how much ones need to get
 */
fun intToRoman(num: Int): String = buildString {
    val map = mapOf(
        1000 to "M",
        500 to "D",
        100 to "C",
        50 to "L",
        10 to "X",
        5 to "V",
        1 to "I",
        0 to "",
    )

    var num = num
    var range = 1
    while (num > 0) {
        val digit = num % 10
        num /= 10

        var ones = digit % 5
        var fives = digit / 5

        if (ones == 4) {
            append(map[(fives + 1) * 5 * range])
            append(map[range])
        } else {
            append(map[range]?.repeat(ones))
            append(map[fives * 5 * range])
        }

        range *= 10
    }
}.reversed()