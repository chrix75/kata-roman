package converters.arabic

enum class RomanConversion(val arabicValue: Int, val repeatable: Int) {
    IV(4, 1),
    V(5, 1),
    IX(9, 1),
    X(10, 3),
    XL(40, 1),
    L(50, 1),
    XC(90, 1),
    C(100, 3),
    CD(400, 1),
    D(500, 1),
    CM(900, 1),
    M(1000, 3);
}


data class RomanValue(val value: String, val rest: Int) {
    companion object {
        fun compute(romanConversion: RomanConversion, number: Int): RomanValue? {
            val (div, rest) = divWithRest(number, romanConversion.arabicValue)
            return if (div in 1..romanConversion.repeatable)
                RomanValue(romanConversion.toString().repeat(div), rest)
            else
                null
        }
    }
}

private fun divWithRest(number: Int, divider: Int) = Division(number.div(divider), number % divider)
private data class Division(val div: Int, val rest: Int)
