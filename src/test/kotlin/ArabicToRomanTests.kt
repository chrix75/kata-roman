import converters.arabic.ArabicToRoman
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ArabicToRomanTests {
    private val converter = ArabicToRoman()
    @Test
    internal fun `convert 1 to I`() {
        val roman = converter.convert(1)
        assertEquals("I", roman)
    }

    @Test
    internal fun `convert 2 to II`() {
        val roman = converter.convert(2)
        assertEquals("II", roman)
    }

    @Test
    internal fun `convert 3 to III`() {
        val roman = converter.convert(3)
        assertEquals("III", roman)
    }

    @Test
    internal fun `convert 4 to IV`() {
        val roman = converter.convert(4)
        assertEquals("IV", roman)
    }

    @Test
    internal fun `convert 5 to V`() {
        val roman = converter.convert(5)
        assertEquals("V", roman)
    }

    @Test
    internal fun `convert 6 to VI`() {
        val roman = converter.convert(6)
        assertEquals("VI", roman)
    }

    @Test
    internal fun `convert 8 to VIII`() {
        val roman = converter.convert(8)
        assertEquals("VIII", roman)
    }

    @Test
    internal fun `convert 9 to IX`() {
        val roman = converter.convert(9)
        assertEquals("IX", roman)
    }

    @Test
    internal fun `convert 10 to X`() {
        val roman = converter.convert(10)
        assertEquals("X", roman)
    }

    @Test
    internal fun `convert 11 to XI`() {
        val roman = converter.convert(11)
        assertEquals("XI", roman)
    }

    @Test
    internal fun `convert 20 to XX`() {
        val roman = converter.convert(20)
        assertEquals("XX", roman)
    }

    @Test
    internal fun `convert 39 to XXXIX`() {
        val roman = converter.convert(39)
        assertEquals("XXXIX", roman)
    }

    @Test
    internal fun `convert 40 to XL`() {
        val roman = converter.convert(40)
        assertEquals("XL", roman)
    }

    @Test
    internal fun `convert 49 to XLIX`() {
        val roman = converter.convert(49)
        assertEquals("XLIX", roman)
    }

    @Test
    internal fun `convert 50 to L`() {
        val roman = converter.convert(50)
        assertEquals("L", roman)
    }

    @Test
    internal fun `convert 89 to LXXXIX`() {
        val roman = converter.convert(89)
        assertEquals("LXXXIX", roman)
    }

    @Test
    internal fun `convert 90 to XC`() {
        val roman = converter.convert(90)
        assertEquals("XC", roman)
    }

    @Test
    internal fun `convert 99 to XCIX`() {
        val roman = converter.convert(99)
        assertEquals("XCIX", roman)
    }

    @Test
    internal fun `convert 100 to C`() {
        val roman = converter.convert(100)
        assertEquals("C", roman)
    }

    @Test
    internal fun `convert 399 to CCCXCIX`() {
        val roman = converter.convert(399)
        assertEquals("CCCXCIX", roman)
    }

    @Test
    internal fun `convert 400 to CD`() {
        val roman = converter.convert(400)
        assertEquals("CD", roman)
    }

    @Test
    internal fun `convert 499 to CD`() {
        val roman = converter.convert(499)
        assertEquals("CDXCIX", roman)
    }

    @Test
    internal fun `convert 500 to D`() {
        val roman = converter.convert(500)
        assertEquals("D", roman)
    }

    @Test
    internal fun `convert 899 to CD`() {
        val roman = converter.convert(899)
        assertEquals("DCCCXCIX", roman)
    }

    @Test
    internal fun `convert 900 to CM`() {
        val roman = converter.convert(900)
        assertEquals("CM", roman)
    }

    @Test
    internal fun `convert 3999 to MMMCMXCIX`() {
        val roman = converter.convert(3999)
        assertEquals("MMMCMXCIX", roman)
    }

    @Test
    internal fun `convert 1066 to MLXVI`() {
        val roman = converter.convert(1066)
        assertEquals("MLXVI", roman)
    }

    @Test
    internal fun `convert 1989 to MCMLXXXIX`() {
        val roman = converter.convert(1989)
        assertEquals("MCMLXXXIX", roman)
    }

}