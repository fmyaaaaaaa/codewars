/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
 *
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 *
 * https://www.codewars.com/kata/517abf86da9663f1d2000003/train/kotlin
 */
fun toCamelCase(str: String):String {
    // Return if the value is empty
    if (str.isEmpty()) return str
    val hyphen = "-"
    val underscore = "_"
    val list = str.split(hyphen, underscore).mapIndexed { index, s ->
        val firstLetter = s.first()
        if (index == 0 && firstLetter == firstLetter.lowercaseChar()) {
            s
        } else {
            s.replaceFirst(firstLetter, firstLetter.uppercaseChar(), true)
        }
    }
    return list.joinToString("")
}

/**
 * Best answer
 */
fun toCamelCaseBest(str: String) = str.split('-', '_').mapIndexed { i, it -> if (i != 0) it.capitalize() else it }.joinToString("")
