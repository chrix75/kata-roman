package converters.roman

class RomanToArabic(private val validator: RomanValidator) {
    fun convert(romanNumber: String): Int {
        val romanValues = romanNumber.toRoman()
        if (validator.validate(romanValues)) {
            return romanValues.foldIndexed(0) { index, acc, roman ->
                if (index < romanValues.size - 1 && roman.lt(romanValues[index + 1])) {
                    acc - roman.arabicValue
                } else {
                    acc + roman.arabicValue
                }
            }
        }
        else {
            throw IllegalArgumentException()
        }
    }

}

enum class Roman(val arabicValue: Int) {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    fun lt(other: Roman) = arabicValue < other.arabicValue

    fun cannotBeSubtracted(other: Roman) = this in listOf(V, L, D) || !isNextEnoughForSubtraction(other)

    companion object {
        fun from(c: Char) = Roman.valueOf(c.toString().uppercase())
    }

    private fun isNextEnoughForSubtraction(other: Roman): Boolean {
        return Roman.values()
            .filter { it.arabicValue > this.arabicValue }.take(2)
            .contains(other)
    }
}

fun String.toRoman() = this.map { Roman.from(it) }