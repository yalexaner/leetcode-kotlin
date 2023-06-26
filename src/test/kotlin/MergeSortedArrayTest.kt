import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MergeSortedArrayTest {

    @Test
    fun `test first example from leetcode`() {
        val firstArray = intArrayOf(1, 2, 3, 0, 0, 0)
        val firstArraySize = 3
        val secondArray = intArrayOf(2, 5, 6)
        val secondArraySize = 3
        mergeSortedArrays(firstArray, firstArraySize, secondArray, secondArraySize)

        val expected = intArrayOf(1, 2, 2, 3, 5, 6)
        assertArrayEquals(expected, firstArray)
    }

    @Test
    fun `test first array is empty`() {
        val firstArray = intArrayOf(0)
        val firstArraySize = 0
        val secondArray = intArrayOf(1)
        val secondArraySize = 1
        mergeSortedArrays(firstArray, firstArraySize, secondArray, secondArraySize)

        val expected = intArrayOf(1)
        assertArrayEquals(expected, firstArray)
    }

    @Test
    fun `test second array is empty`() {
        val firstArray = intArrayOf(1)
        val firstArraySize = 1
        val secondArray = intArrayOf()
        val secondArraySize = 0
        mergeSortedArrays(firstArray, firstArraySize, secondArray, secondArraySize)

        val expected = intArrayOf(1)
        assertArrayEquals(expected, firstArray)
    }

    @Test
    fun `test empty arrays`() {
        val firstArray = intArrayOf()
        val firstArraySize = 0
        val secondArray = intArrayOf()
        val secondArraySize = 0
        mergeSortedArrays(firstArray, firstArraySize, secondArray, secondArraySize)

        val expected = intArrayOf()
        assertArrayEquals(expected, firstArray)
    }

    @Test
    fun `test numbers from first array are smaller than numbers from second array`() {
        val firstArray = intArrayOf(1, 2, 3, 0, 0, 0)
        val firstArraySize = 3
        val secondArray = intArrayOf(4, 5, 6)
        val secondArraySize = 3
        mergeSortedArrays(firstArray, firstArraySize, secondArray, secondArraySize)

        val expected = intArrayOf(1, 2, 3, 4, 5, 6)
        assertArrayEquals(expected, firstArray)
    }

    @Test
    fun `test numbers from second array are smaller than numbers from first array`() {
        val firstArray = intArrayOf(4, 5, 6, 0, 0, 0)
        val firstArraySize = 3
        val secondArray = intArrayOf(1, 2, 3)
        val secondArraySize = 3
        mergeSortedArrays(firstArray, firstArraySize, secondArray, secondArraySize)

        val expected = intArrayOf(1, 2, 3, 4, 5, 6)
        assertArrayEquals(expected, firstArray)
    }

    @Test
    fun `test edge case`() {
        val firstArray = intArrayOf(4, 5, 6, 0, 0, 0)
        val firstArraySize = 3
        val secondArray = intArrayOf(1, 2, 7)
        val secondArraySize = 3
        mergeSortedArrays(firstArray, firstArraySize, secondArray, secondArraySize)

        val expected = intArrayOf(1, 2, 4, 5, 6, 7)
        assertArrayEquals(expected, firstArray)
    }
}