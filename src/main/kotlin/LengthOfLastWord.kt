fun lengthOfLastWord(s: String): Int {
    var lastWordLength = 0
    for (i in s.lastIndex downTo 0) {
        if (s[i] != ' ') {
            lastWordLength++
        } else if (lastWordLength > 0) {
            break
        }
    }

    return lastWordLength
}