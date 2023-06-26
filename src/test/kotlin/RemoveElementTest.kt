import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveElementTest {

    @Test
    fun `test first example from leetcode`() {
        val nums = intArrayOf(3, 2, 2, 3)
        val element = 3

        val expectedSize = 2
        val actualSize = removeElement(nums, element)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf(2, 2)
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test second example from leetcode`() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val element = 2

        val expectedSize = 5
        val actualSize = removeElement(nums, element)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf(0, 1, 3, 0, 4)
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test empty array`() {
        val nums = intArrayOf()
        val element = 0

        val expectedSize = 0
        val actualSize = removeElement(nums, element)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf()
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test all numbers from array should be removed`() {
        val nums = intArrayOf(1, 1, 1, 1, 1)
        val element = 1

        val expectedSize = 0
        val actualSize = removeElement(nums, element)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf()
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test numbers from array and the element are max allowed values`() {
        val nums = intArrayOf(50, 50, 50)
        val element = 100

        val expectedSize = 3
        val actualSize = removeElement(nums, element)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf(50, 50, 50)
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }

    @Test
    fun `test size of array is max allowed, all elements should be removed except the last one`() {
        val nums = IntArray(100) { 50 }.apply {
            this[99] = 100
        }
        val element = 50

        val expectedSize = 1
        val actualSize = removeElement(nums, element)
        assertEquals(expectedSize, actualSize)

        val expectedArray = intArrayOf(100)
        val actualArray = nums.copyOfRange(0, actualSize)
        assertArrayEquals(expectedArray, actualArray)
    }
}