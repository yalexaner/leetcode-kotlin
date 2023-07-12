import kotlin.math.max

fun hIndex(citations: IntArray): Int {
    citations.sortedDescending().forEachIndexed { index, value ->
        when {
            value == 0 -> return index
            index + 1 >= value -> return max(value, index)
        }
    }

    return citations.size
}