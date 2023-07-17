import kotlin.math.min

fun longestCommonPrefix(words: Array<String>): String {
    var prefix = words[0]
    for (i in 1 until words.size) {
        prefix = computeCommonPrefix(prefix, words[i])
        if (prefix.isEmpty()) {
            break
        }
    }

    return prefix
}

private fun computeCommonPrefix(first: String, second: String): String {
    return buildString {
        for (i in 0 until min(first.length, second.length)) {
            if (first[i] == second[i]) {
                append(first[i])
            } else {
                break
            }
        }
    }
}