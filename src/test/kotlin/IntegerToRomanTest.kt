import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IntegerToRomanTest {

    @Test
    fun `first test from leetcode`() {
        val num = 3

        val expected = "III"
        val actual = intToRoman(num)
        assertEquals(expected, actual)
    }

    @Test
    fun `second test from leetcode`() {
        val num = 58

        val expected = "LVIII"
        val actual = intToRoman(num)
        assertEquals(expected, actual)
    }

    @Test
    fun `third test from leetcode`() {
        val num = 1994

        val expected = "MCMXCIV"
        val actual = intToRoman(num)
        assertEquals(expected, actual)
    }

    @Test
    fun `test first 9 roman digits`() {
        val map = mapOf(
            1 to "I",
            2 to "II",
            3 to "III",
            4 to "IV",
            5 to "V",
            6 to "VI",
            7 to "VII",
            8 to "VIII",
            9 to "IX",
        )

        val digits = IntArray(9) { it + 1 }

        for (digit in digits) {
            val expected = map[digit]
            val actual = intToRoman(digit)
            assertEquals(expected, actual)
        }
    }

    @Test
    fun `test max allowed value`() {
        val num = 3_999

        val expected = "MMMCMXCIX"
        val actual = intToRoman(num)
        assertEquals(expected, actual)
    }
}