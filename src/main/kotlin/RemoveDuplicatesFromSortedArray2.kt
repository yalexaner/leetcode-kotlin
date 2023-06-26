fun removeDuplicates2(nums: IntArray): Int {
    var duplicatesFound = 0
    for (i in 2..nums.lastIndex) {
        if (
            nums[i] == nums[i - (1 + duplicatesFound)]
            && nums[i] == nums[i - (2 + duplicatesFound)]
        ) {
            duplicatesFound++
        } else {
            nums[i - duplicatesFound] = nums[i]
        }
    }

    return nums.size - duplicatesFound
}