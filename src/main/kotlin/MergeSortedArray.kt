fun mergeSortedArrays(firstArray: IntArray, firstArraySize: Int, secondArray: IntArray, secondArraySize: Int) {
    var firstArrayIndex = firstArraySize - 1
    var secondArrayIndex = secondArraySize - 1
    var mergedArrayIndex = firstArraySize + secondArraySize - 1

    while (mergedArrayIndex >= 0) {
        val firstValue = firstArray.getOrElse(firstArrayIndex) { Int.MIN_VALUE }
        val secondValue = secondArray.getOrElse(secondArrayIndex) { Int.MIN_VALUE }
        if (firstValue > secondValue) {
            firstArray[mergedArrayIndex] = firstArray[firstArrayIndex]
            firstArrayIndex--
        } else {
            firstArray[mergedArrayIndex] = secondArray[secondArrayIndex]
            secondArrayIndex--
        }

        mergedArrayIndex--
    }
}