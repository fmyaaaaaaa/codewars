package kyu6.two_sum

/**
 * Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different items in the array that, when added together, give the target value. The indices of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).
 * For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
 * The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target will always be the sum of two different items from that array).
 * Based on: https://leetcode.com/problems/two-sum/
 *
 * two_sum([1, 2, 3], 4) == {0, 2}
 * two_sum([3, 2, 4], 6) == {1, 2}
 *
 * https://www.codewars.com/kata/52c31f8e6605bcc646000082/train/kotlin
 */
object TwoSum {
    fun twoSum(numbers: IntArray, target: Int): Pair<Int,Int> {
        var result: Pair<Int, Int> = Pair(0, 0)
        numbers.forEachIndexed loop@ { index, _ ->
            val findIndex = numbers.indexOfFirst { target == (numbers[index] + it) }
            if (findIndex != -1 && index != findIndex) {
                result = Pair(index, findIndex)
                return@loop
            }
        }
        return result
    }
}
