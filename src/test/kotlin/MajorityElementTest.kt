import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MajorityElementTest {

    @Test
    fun `first test from leetcode`() {
        val nums = intArrayOf(3, 2, 3)

        val expected = 3
        val actual = majorityElement(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun `second test from leetcode`() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)

        val expected = 2
        val actual = majorityElement(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has only one element`() {
        val nums = intArrayOf(1)

        val expected = 1
        val actual = majorityElement(nums)
        assertEquals(expected, actual)
    }
}