fun canJump(nums: IntArray): Boolean {
    var index = nums.size - 1

    // iterate from the nums.size - 2 index down to 0
    for (i in nums.size - 2 downTo 0) {
        if (i + nums[i] >= index) {
            index = i
        }
    }

    return index == 0
}