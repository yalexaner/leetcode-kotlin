fun removeElement(nums: IntArray, element: Int): Int {
    var elementsFound = 0
    for (i in nums.indices) {
        if (nums[i] == element) {
            elementsFound++
        } else {
            nums[i - elementsFound] = nums[i]
        }
    }

    return nums.size - elementsFound
}