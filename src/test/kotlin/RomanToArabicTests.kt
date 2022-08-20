import converters.roman.RomanToArabic
import converters.roman.RomanValidatorBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RomanToArabicTests {
    private val converter = RomanToArabic(RomanValidatorBuilder().defaults())

    @Test
    internal fun `convert I to 1`() {
        val arabic = converter.convert("I")
        assertEquals(1, arabic)
    }

    @Test
    internal fun `convert II to 2`() {
        val arabic = converter.convert("II")
        assertEquals(2, arabic)
    }

    @Test
    internal fun `convert V to 5`() {
        val arabic = converter.convert("V")
        assertEquals(5, arabic)
    }

    @Test
    internal fun `convert IV to 4`() {
        val arabic = converter.convert("IV")
        assertEquals(4, arabic)
    }

    @Test
    internal fun `convert XIII to 13`() {
        val arabic = converter.convert("XIII")
        assertEquals(13, arabic)
    }

    @Test
    internal fun `convert MLXVI to 1066`() {
        val arabic = converter.convert("MLXVI")
        assertEquals(1066, arabic)
    }

    @Test
    internal fun `convert MCMLXXXIX to 1989`() {
        val arabic = converter.convert("MCMLXXXIX")
        assertEquals(1989 , arabic)
    }
}