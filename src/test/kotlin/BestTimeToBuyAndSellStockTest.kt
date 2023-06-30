import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStockTest {

    @Test
    fun `first test from leetcode`() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)

        val expected = 5
        val actual = maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun `second test from leetcode`() {
        val prices = intArrayOf(7, 6, 4, 3, 1)

        val expected = 0
        val actual = maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun `test array has only one element`() {
        val prices = intArrayOf(1)

        val expected = 0
        val actual = maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun `test all prices are the same`() {
        val prices = intArrayOf(1, 1, 1, 1, 1)

        val expectedSize = 0
        val actualSize = maxProfit(prices)
        assertEquals(expectedSize, actualSize)
    }
}