fun reverseWords(s: String): String {
    val stackOfWords = ArrayDeque<String>()
    var currentWord = ""

    for (c in s) {
        if (c == ' ') {
            if (currentWord.isNotEmpty()) stackOfWords.addFirst(currentWord)
            currentWord = ""
        } else {
            currentWord += c
        }
    }

    if (currentWord.isNotEmpty()) {
        stackOfWords.addFirst(currentWord)
    }

    return buildString {
        while (true) {
            append(stackOfWords.removeFirst())
            if (stackOfWords.isEmpty()) break
            append(" ")
        }
    }
}