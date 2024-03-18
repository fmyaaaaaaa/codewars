package kyu7.two_oldest_age
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FunctionTOAKtTest: StringSpec() {
    init {
        "twoOldestAges(listOf(1,5,87,45,8,8)) should be listOf(45, 87)" {
            twoOldestAges(listOf(1,5,87,45,8,8)) shouldBe listOf(45, 87)
        }
        "twoOldestAges(listOf(6,5,83,5,3,18)) should be listOf(18, 83)" {
            twoOldestAges(listOf(6,5,83,5,3,18)) shouldBe listOf(18, 83)
        }
    }
}