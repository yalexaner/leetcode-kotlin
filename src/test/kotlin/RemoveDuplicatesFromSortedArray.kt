import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedArray {

    @Test
    fun `test first example from leetcode`() {
        val nums = intArrayOf(1, 1, 2)

        val expectedSize = 2
        val actualSize = removeDuplicates(nums)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf(1, 2)
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test second example from leetcode`() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

        val expectedSize = 5
        val actualSize = removeDuplicates(nums)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf(0, 1, 2, 3, 4)
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test empty array`() {
        val nums = intArrayOf()

        val expectedSize = 0
        val actualSize = removeDuplicates(nums)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf()
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test all numbers in array are the same`() {
        val nums = intArrayOf(1, 1, 1, 1, 1)

        val expectedSize = 1
        val actualSize = removeDuplicates(nums)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf(1)
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test array consist of all non-duplicate numbers from the min to the max allowed`() {
        val nums = IntArray(201) { it - 100 }

        val expectedSize = 201
        val actualSize = removeDuplicates(nums)
        assertEquals(expectedSize, actualSize)

        val expectedArray = IntArray(201) { it - 100 }
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }
}