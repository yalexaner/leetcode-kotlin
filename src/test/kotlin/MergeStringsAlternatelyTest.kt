import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MergeStringsAlternatelyTest {

    @Test
    fun `first test from leetcode`() {
        val word1 = "abc"
        val word2 = "pqr"

        val expected = "apbqcr"
        val actual = mergeAlternately(word1, word2)
        assertEquals(expected, actual)
    }

    @Test
    fun `second test from leetcode`() {
        val word1 = "ab"
        val word2 = "pqrs"

        val expected = "apbqrs"
        val actual = mergeAlternately(word1, word2)
        assertEquals(expected, actual)
    }

    @Test
    fun `third test from leetcode`() {
        val word1 = "abcd"
        val word2 = "pq"

        val expected = "apbqcd"
        val actual = mergeAlternately(word1, word2)
        assertEquals(expected, actual)
    }

    @Test
    fun `test both strings are min length`() {
        val word1 = "a"
        val word2 = "b"

        val expected = "ab"
        val actual = mergeAlternately(word1, word2)
        assertEquals(expected, actual)
    }

    @Test
    fun `test both strings are max length`() {
        val word1 = "a".repeat(100)
        val word2 = "a".repeat(100)

        val expected = word1 + word2
        val actual = mergeAlternately(word1, word2)
        assertEquals(expected, actual)
    }
}