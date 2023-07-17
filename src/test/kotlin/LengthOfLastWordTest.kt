import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LengthOfLastWordTest {

    @Test
    fun `first test from leetcode`() {
        val s = "Hello World"

        val expected = 5
        val actual = lengthOfLastWord(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `second test from leetcode`() {
        val s = "   fly me   to   the moon  "

        val expected = 4
        val actual = lengthOfLastWord(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `third test from leetcode`() {
        val s = "luffy is still joyboy"

        val expected = 6
        val actual = lengthOfLastWord(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `test string has only one word of one symbol`() {
        val s = "a"

        val expected = 1
        val actual = lengthOfLastWord(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `test string is max allowed length of one-symbol word and spaces`() {
        val s = "a" + " ".repeat(MAX_ALLOWED_LENGTH - 1)

        val expected = 1
        val actual = lengthOfLastWord(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `test string is max allowed length word`() {
        val s = "x".repeat(MAX_ALLOWED_LENGTH)

        val expected = MAX_ALLOWED_LENGTH
        val actual = lengthOfLastWord(s)
        assertEquals(expected, actual)
    }

    companion object {
        private const val MAX_ALLOWED_LENGTH = 10_000
    }
}