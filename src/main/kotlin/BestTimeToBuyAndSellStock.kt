import kotlin.math.max

fun maxProfit(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE
    var maxProfit = 0

    for (price in prices) {
        if (price < minPrice) {
            minPrice = price
        } else {
            maxProfit = max(price - minPrice, maxProfit)
        }
    }

    return maxProfit
}