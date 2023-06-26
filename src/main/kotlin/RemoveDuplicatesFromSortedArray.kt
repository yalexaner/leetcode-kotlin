fun removeDuplicates(nums: IntArray): Int {
    var duplicatesFound = 0
    for (i in 1..nums.lastIndex) {
        if (nums[i] == nums[i - 1]) {
            duplicatesFound++
        } else {
            nums[i - duplicatesFound] = nums[i]
        }
    }

    return nums.size - duplicatesFound
}