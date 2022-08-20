import converters.roman.RomanValidatorBuilder
import converters.roman.toRoman
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RomanValidationTests {
    private val validator = RomanValidatorBuilder().defaults()
    @Test
    internal fun `IIII is invalid`() {
        assertFalse(validator.validate("IIII".toRoman()))
    }

    @Test
    internal fun `V can only be present once`() {
        assertFalse(validator.validate("VV".toRoman()))
        assertFalse(validator.validate("VIV".toRoman()))
    }

    @Test
    internal fun `LXXXIX is valid`() {
        assertTrue(validator.validate("LXXXIX".toRoman()))
    }

    @Test
    internal fun `IC is invalid`() {
        assertFalse(validator.validate("IC".toRoman()))
    }

    @Test
    internal fun `XXC is invalid`() {
        assertFalse(validator.validate("XXC".toRoman()))
    }

    @Test
    internal fun `VX is invalid`() {
        assertFalse(validator.validate("VX".toRoman()))
    }

    @Test
    internal fun `IV is valid`() {
        assertTrue(validator.validate("IV".toRoman()))
    }
}