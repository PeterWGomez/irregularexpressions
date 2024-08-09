import org.example.FloatVerifier
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FloatTest {
    @Test
    fun testFloat() {
        val verifier = FloatVerifier()
        assertEquals(verifier.verify("12345"), true)
        assertEquals(verifier.verify("1.01"), true)
        assertEquals(verifier.verify("0.01"), true)
        assertEquals(verifier.verify(".01"), true)
        assertEquals(verifier.verify("15.25"), true)
        assertEquals(verifier.verify(".1"), true)
        assertEquals(verifier.verify("1.1"), true)
        assertEquals(verifier.verify("0123456768798"), false)
        assertEquals(verifier.verify("0.10.1"), false)
        assertEquals(verifier.verify("01"), false)
        assertEquals(verifier.verify("123abc123"), false)
    }

}