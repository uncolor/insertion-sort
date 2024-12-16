fun main() {
    val array = intArrayOf(7, 5, 4, 12, 43, 6, 52)
    println(insertionSort(array).joinToString(","))
}

/**
 * Реализация алгоритма "Сортировка вставкой"
 *
 * @param array Массив для сортировки
 */
fun insertionSort(array: IntArray): IntArray {
    for (i in 1..<array.size) {
        val key = array[i]
        var j = i - 1
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j]
            j--
        }
        array[j + 1] = key
    }
    return array
}