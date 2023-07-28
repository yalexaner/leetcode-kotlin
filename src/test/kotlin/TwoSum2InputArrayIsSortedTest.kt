import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TwoSum2InputArrayIsSortedTest {

    @Test
    fun `first test from leetcode`() {
        val numbers = intArrayOf(2, 7, 11, 15)
        val target = 9

        val expected = intArrayOf(1, 2)
        val actual = twoSum(numbers, target)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `second test from leetcode`() {
        val numbers = intArrayOf(2, 3, 4)
        val target = 6

        val expected = intArrayOf(1, 3)
        val actual = twoSum(numbers, target)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `third test from leetcode`() {
        val numbers = intArrayOf(-1, 0)
        val target = -1

        val expected = intArrayOf(1, 2)
        val actual = twoSum(numbers, target)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `test the target value as negative and the lowest value`() {
        val firstValueIndex = 0
        val secondValueIndex = 1_000

        val numbers = IntArray(1_001) { index ->
            when (index) {
                firstValueIndex -> LOWEST_VALUE
                secondValueIndex -> 0
                else -> HIGHEST_VALUE
            }
        }
        val target = LOWEST_VALUE

        val expected = intArrayOf(firstValueIndex + 1, secondValueIndex + 1)
        val actual = twoSum(numbers, target)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `test the target value as positive and the highest value`() {
        val firstValueIndex = 0
        val secondValueIndex = 1_000

        val numbers = IntArray(1_001) { index ->
            when (index) {
                firstValueIndex -> 1
                secondValueIndex -> HIGHEST_VALUE - 1
                else -> LOWEST_VALUE
            }
        }
        val target = HIGHEST_VALUE

        val expected = intArrayOf(firstValueIndex + 1, secondValueIndex + 1)
        val actual = twoSum(numbers, target)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `test size of numbers is the max allowed`() {
        val firstValueIndex = 14_999
        val secondValueIndex = 15_000

        val numbers = IntArray(MAX_LENGTH) { index ->
            when (index) {
                firstValueIndex -> 500
                secondValueIndex -> -500
                else -> 1
            }
        }
        val target = 0

        val expected = intArrayOf(firstValueIndex + 1, secondValueIndex + 1)
        val actual = twoSum(numbers, target)
        assertArrayEquals(expected, actual)
    }

    companion object {
        private const val LOWEST_VALUE = -1_000
        private const val HIGHEST_VALUE = 1_000
        private const val MAX_LENGTH = 30_000
    }
}