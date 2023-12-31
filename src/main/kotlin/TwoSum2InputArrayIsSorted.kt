fun twoSum(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.lastIndex
    while (left < right) {
        val sum = numbers[left] + numbers[right]
        when {
            sum < target -> left++
            sum > target -> right--
            else -> return intArrayOf(left + 1, right + 1)
        }
    }
    return intArrayOf(left + 1, right + 1)
}