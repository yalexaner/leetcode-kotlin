import kotlin.math.max

fun hIndex(citations: IntArray): Int {
    return citations.sortedDescending().withIndex().find { it.index + 1 >= it.value }?.let { max(it.index, it.value) } ?: citations.size
}