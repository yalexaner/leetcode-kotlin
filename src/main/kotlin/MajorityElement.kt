fun majorityElement(nums: IntArray): Int {
    val elementsMap = mutableMapOf<Int, Int>()
    for (num in nums) {
        elementsMap[num] = elementsMap.getOrDefault(num, 0) + 1
    }

    for ((key, value) in elementsMap) {
        if (value > nums.size / 2) {
            return key
        }
    }

    return 0
}