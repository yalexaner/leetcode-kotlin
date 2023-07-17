import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestCommonPrefixTest {

    @Test
    fun `first test from leetcode`() {
        val words = arrayOf("flower", "flow", "flight")

        val expected = "fl"
        val actual = longestCommonPrefix(words)
        assertEquals(expected, actual)
    }

    @Test
    fun `second test from leetcode`() {
        val words = arrayOf("dog", "racecar", "car")

        val expected = ""
        val actual = longestCommonPrefix(words)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has only one max-allowed length word`() {
        val words = arrayOf("a".repeat(MAX_ALLOWED_LENGTH))

        val expected = "a".repeat(MAX_ALLOWED_LENGTH)
        val actual = longestCommonPrefix(words)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has one empty word`() {
        val words = arrayOf("")

        val expected = ""
        val actual = longestCommonPrefix(words)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has max-allowed same words with max-allowed length`() {
        val words = Array(MAX_ALLOWED_LENGTH) { "a".repeat(MAX_ALLOWED_LENGTH) }

        val expected = "a".repeat(MAX_ALLOWED_LENGTH)
        val actual = longestCommonPrefix(words)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has max-allowed empty words`() {
        val words = Array(MAX_ALLOWED_LENGTH) { "" }

        val expected = ""
        val actual = longestCommonPrefix(words)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has max-allowed different words`() {
        val words = Array(MAX_ALLOWED_LENGTH) { it.toString() }

        val expected = ""
        val actual = longestCommonPrefix(words)
        assertEquals(expected, actual)
    }

    companion object {
        private const val MAX_ALLOWED_LENGTH = 200
    }
}