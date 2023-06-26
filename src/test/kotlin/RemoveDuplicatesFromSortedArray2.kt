import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedArray2 {

    @Test
    fun `test first example from leetcode`() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)

        val expectedSize = 5
        val actualSize = removeDuplicates2(nums)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf(1, 1, 2, 2, 3)
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test second example from leetcode`() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)

        val expectedSize = 7
        val actualSize = removeDuplicates2(nums)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf(0, 0, 1, 1, 2, 3, 3)
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test empty array`() {
        val nums = intArrayOf()

        val expectedSize = 0
        val actualSize = removeDuplicates2(nums)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf()
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test all numbers in array are the same`() {
        val nums = intArrayOf(1, 1, 1, 1, 1)

        val expectedSize = 2
        val actualSize = removeDuplicates2(nums)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf(1, 1)
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }
}