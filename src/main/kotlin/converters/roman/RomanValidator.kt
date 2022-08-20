package converters.roman

class RomanValidator(private val validations: List<(List<Roman>) -> Boolean>) {
    fun validate(romanValues: List<Roman>): Boolean {
        return validations.none { it(romanValues) }
    }
}

class RomanValidatorBuilder {
    fun defaults() =
        RomanValidator(
            listOf(
                this::invalidMinus,
                this::tooManyConsecutiveRepeats,
                this::invalidRepeat
            )
        )

    private fun invalidMinus(romanValues: List<Roman>): Boolean {
        val previous = romanValues[0]
        for (index in 1 until romanValues.size) {
            val roman = romanValues[index]
            if (previous.lt(roman)) {
                if (previous.cannotBeSubtracted(roman)) {
                    return true
                }
            }

            if (index < romanValues.size - 1) {
                val next = romanValues[index + 1]
                if (previous.arabicValue < next.arabicValue) {
                    return true
                }
            }
        }
        return false
    }

    private fun tooManyConsecutiveRepeats(romanValues: List<Roman>): Boolean {
        val counters = mutableMapOf(romanValues[0] to 1)
        for (index in 1 until romanValues.size) {
            val roman = romanValues[index]
            val c = counters.getOrPut(roman) { 0 }
            if (romanValues[index - 1] == roman) {
                counters[roman] = c + 1
            } else {
                counters[roman] = 0
            }
        }

        return counters.values.any { it > 3 }
    }

    private fun invalidRepeat(romanValues: List<Roman>): Boolean {
        val counters = mutableMapOf<Roman, Int>()
        romanValues.forEach { roman ->
            if (roman in listOf(Roman.V, Roman.L, Roman.D)) {
                val c = counters.getOrPut(roman) { 0 }
                counters[roman] = c + 1
            }
        }

        return counters.values.any { it > 1 }
    }
}
