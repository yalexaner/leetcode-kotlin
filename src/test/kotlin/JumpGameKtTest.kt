import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class JumpGameKtTest {

    @Test
    fun `first test from leetcode`() {
        val nums = intArrayOf(2, 3, 1, 1, 4)

        val expected = true
        val actual = canJump(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun `second test from leetcode`() {
        val nums = intArrayOf(3, 2, 1, 0, 4)

        val expected = false
        val actual = canJump(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has only one element and its value is zero`() {
        val nums = intArrayOf(0)

        val expected = true
        val actual = canJump(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has only one element and its value is non-zero`() {
        val nums = intArrayOf(1)

        val expected = true
        val actual = canJump(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has max amount of elements and they're all zeros`() {
        val nums = IntArray(10_000) { 0 }

        val expected = false
        val actual = canJump(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has max amount of elements and they're all max allowed values`() {
        val nums = IntArray(10_000) { 100_000 }

        val expected = true
        val actual = canJump(nums)
        assertEquals(expected, actual)
    }
}