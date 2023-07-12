import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HIndexTest {

    @Test
    fun `first test from leetcode`() {
        val citations = intArrayOf(3, 0, 6, 1, 5)

        val expected = 3
        val actual = hIndex(citations)
        assertEquals(expected, actual)
    }

    @Test
    fun `second test from leetcode`() {
        val citations = intArrayOf(1, 3, 1)

        val expected = 1
        val actual = hIndex(citations)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has only one element that is zero`() {
        val citations = intArrayOf(0)

        val expected = 0
        val actual = hIndex(citations)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has only one element that is one`() {
        val citations = intArrayOf(1)

        val expected = 1
        val actual = hIndex(citations)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has only one element that is two`() {
        val citations = intArrayOf(2)

        val expected = 1
        val actual = hIndex(citations)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array is max allowed size containing zeros`() {
        val citations = IntArray(MAX_ALLOWED_SIZE) { 0 }

        val expected = 0
        val actual = hIndex(citations)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array is max allowed size containing max allowed numbers`() {
        val citations = IntArray(MAX_ALLOWED_SIZE) { MAX_ALLOWED_VALUE }

        val expected = MAX_ALLOWED_VALUE
        val actual = hIndex(citations)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array contains all different values`() {
        val citations = IntArray(MAX_ALLOWED_VALUE + 1) { it }

        val expected = 500
        val actual = hIndex(citations)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has zeros`() {
        val citations = intArrayOf(42, 42, 0, 0)

        val expected = 2
        val actual = hIndex(citations)
        assertEquals(expected, actual)
    }

    companion object {
        private const val MAX_ALLOWED_SIZE = 5_000
        private const val MAX_ALLOWED_VALUE = 1_000
    }
}