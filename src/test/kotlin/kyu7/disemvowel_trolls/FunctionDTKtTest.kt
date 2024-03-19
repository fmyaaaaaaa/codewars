package kyu7.disemvowel_trolls

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class FunctionDTKtTest {
    @Test
    fun FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!", disemvowel("This website is for losers LOL!")
        )
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", disemvowel(
            "No offense but,\nYour writing is among the worst I've ever read"))
        assertEquals("Wht r y,  cmmnst?", disemvowel("What are you, a communist?"))
    }
}