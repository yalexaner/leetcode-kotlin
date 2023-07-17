import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanToIntegerTest {

    @Test
    fun `first test from leetcode`() {
        val s = "III"

        val expected = 3
        val actual = romanToInt(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `second test from leetcode`() {
        val s = "LVIII"

        val expected = 58
        val actual = romanToInt(s)
        assertEquals(expected, actual)
    }

    @Test
    fun `third test from leetcode`() {
        val s = "MCMXCIV"

        val expected = 1994
        val actual = romanToInt(s)
        assertEquals(expected, actual)
    }
}