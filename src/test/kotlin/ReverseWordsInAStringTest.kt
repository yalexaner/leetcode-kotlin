import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseWordsInAStringTest {

    @Test
    fun `first test from leetcode`() {
        val s = "the sky is blue"

        val expected = "blue is sky the"
        val actual = reverseWords(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `second test from leetcode`() {
        val s = "  hello world  "

        val expected = "world hello"
        val actual = reverseWords(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `third test from leetcode`() {
        val s = "a good   example"

        val expected = "example good a"
        val actual = reverseWords(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `test string contains only one word of one-letter length`() {
        val s = "a"

        val expected = "a"
        val actual = reverseWords(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `test string contains one word of max-allowed length`() {
        val s = "a".repeat(MAX_ALLOWED_LENGTH)

        val expected = "a".repeat(MAX_ALLOWED_LENGTH)
        val actual = reverseWords(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `test string contains 10^4 - 1 leading spaces and a one-letter word`() {
        val s = " ".repeat(MAX_ALLOWED_LENGTH - 1) + "a"

        val expected = "a"
        val actual = reverseWords(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `test string contains one-letter word and 10^4 - 1 trailing spaces`() {
        val s = "a" + " ".repeat(MAX_ALLOWED_LENGTH - 1)

        val expected = "a"
        val actual = reverseWords(s)
        assertEquals(expected, actual)
    }

    companion object {
        private const val MAX_ALLOWED_LENGTH = 10_000
    }
}