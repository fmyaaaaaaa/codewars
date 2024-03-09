import kotlin.math.absoluteValue

/**
 * This is an answer code for the below question
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 * Additionally, if the number is negative, return 0.
 * Note: If the number is a multiple of both 3 and 5, only count it once.
 *
 * https://www.codewars.com/kata/514b92a657cdc65150000006/train/kotlin
 */
fun solution(number: Int): Int {
    // Check the availability
    val isValidArgNumber = isValidArgNumber(number)
    if (!isValidArgNumber) return 0

    val countMultipleBy3 = getCountByArgNumber(3, number)
    val countMultipleBy5 = getCountByArgNumber(5, number)

    val listFor3 = getNumberListByArgNumber(3, countMultipleBy3)
    val listFor5 = getNumberListByArgNumber(5, countMultipleBy5)
    val sum = sumWithoutDuplicatedNumbers(listFor3, listFor5)
    return sum
}

fun isValidArgNumber(number: Int): Boolean {
    if (number <= 0) return false
    val notGoodNumbers: List<Int> = listOf(1, 2)
    return !notGoodNumbers.contains(number)
}

fun getCountByArgNumber(naturalNumber: Int, number: Int): Int {
    val isJustNumber = (number % naturalNumber) == 0
    val count = (number / naturalNumber).absoluteValue
    val isSameWithNatural = number == naturalNumber
    if (isJustNumber || isSameWithNatural) {
        return count - 1
    }
    return count
}

fun getNumberListByArgNumber(naturalNumber: Int, count: Int): List<Int> {
    val numbers = arrayListOf<Int>()
    for (i in 1 ..count) {
        numbers.add(naturalNumber * i)
    }
    return numbers
}

fun sumWithoutDuplicatedNumbers(listOf3: List<Int>, listOf5: List<Int>): Int {
    val mergedList = listOf3 + listOf5
    val removeDuplicatedSet = mergedList.toSet()
    return removeDuplicatedSet.sum()
}


/**
 * The below answer is cool answer
 */
fun solutionBest(number: Int) = (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
