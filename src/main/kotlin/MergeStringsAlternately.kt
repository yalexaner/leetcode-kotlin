fun mergeAlternately(word1: String, word2: String): String {
    return buildString {
        repeat(kotlin.math.max(word1.length, word2.length)) { index ->
            word1.getOrNull(index)?.let { append(it) }
            word2.getOrNull(index)?.let { append(it) }
        }
    }
}