package converters.arabic

class ArabicToRoman {
    private val one = "I"

    private val romanConversions = RomanConversion.values().sortedBy { it.arabicValue }.reversed()

    fun convert(number: Int): String {
        val value = romanConversions.firstNotNullOfOrNull { RomanValue.compute(it, number) }
        if (value != null) return value.value + convert(value.rest)

        return one.repeat(number)
    }
}
