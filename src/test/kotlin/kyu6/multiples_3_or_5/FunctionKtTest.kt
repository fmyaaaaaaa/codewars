package kyu6.multiples_3_or_5

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import solution

class FunctionKtTest {
    @Test
    fun testFixed() {
        assertEquals(23, solution(10))
        assertEquals(78, solution(20))
        assertEquals(9168, solution(200))
    }
}