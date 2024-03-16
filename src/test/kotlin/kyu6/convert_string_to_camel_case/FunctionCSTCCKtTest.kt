package kyu6.convert_string_to_camel_case

import org.junit.jupiter.api.Assertions.assertEquals
import toCamelCase
import kotlin.test.Test

class FunctionCSTCCKtTest {
    @Test
    fun testFixed() {
        assertEquals("", toCamelCase(""))
        assertEquals("theStealthWarrior", toCamelCase("the_stealth_warrior"))
        assertEquals("TheStealthWarrior", toCamelCase("The-Stealth-Warrior"))
        assertEquals("theStealth Warrior", toCamelCase("the-Stealth Warrior"))
        assertEquals("ABC", toCamelCase("A-B-C"))
    }
}
