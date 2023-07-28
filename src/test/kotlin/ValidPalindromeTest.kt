import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidPalindromeTest {

    @Test
    fun `first test from leetcode`() {
        val s = "A man, a plan, a canal: Panama"
        assertTrue(isPalindrome(s))
    }

    @Test
    fun `second test from leetcode`() {
        val s = "race a car"
        assertFalse(isPalindrome(s))
    }

    @Test
    fun `third test from leetcode`() {
        val s = " "
        assertTrue(isPalindrome(s))
    }

    @Test
    fun `test string is max-allowed length and consists of the same letters`() {
        val s = "a".repeat(MAX_ALLOWED_LENGTH)
        assertTrue(isPalindrome(s))
    }

    companion object {
        private const val MAX_ALLOWED_LENGTH = 200_000
    }
}