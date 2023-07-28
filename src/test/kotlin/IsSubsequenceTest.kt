import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IsSubsequenceTest {

    @Test
    fun `first test from leetcode`() {
        val s = "abc"
        val t = "ahbgdc"
        assertTrue(isSubsequence(s, t))
    }

    @Test
    fun `second test from leetcode`() {
        val s = "axc"
        val t = "ahbgdc"
        assertFalse(isSubsequence(s, t))
    }

    @Test
    fun `test both strings are empty`() {
        val s = ""
        val t = ""
        assertTrue(isSubsequence(s, t))
    }

    @Test
    fun `test first string is empty, second is not`() {
        val s = ""
        val t = "abc"
        assertTrue(isSubsequence(s, t))
    }

    @Test
    fun `test second string is empty, first is not`() {
        val s = "abc"
        val t = ""
        assertFalse(isSubsequence(s, t))
    }

    @Test
    fun `test first string is max-allowed length and is larger than the second one`() {
        val s = "a".repeat(MAX_ALLOWED_LENGTH)
        val t = "a".repeat(MAX_ALLOWED_LENGTH - 1)
        assertFalse(isSubsequence(s, t))
    }

    companion object {
        private const val MAX_ALLOWED_LENGTH = 100
    }
}