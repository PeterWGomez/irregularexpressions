import org.example.BinaryVerifier
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BinaryTest {
    @Test
    fun testBinary() {
        val verifier = BinaryVerifier()
        assertEquals(verifier.verify("1"), true)
        assertEquals(verifier.verify("11"), true)
        assertEquals(verifier.verify("101"), true)
        assertEquals(verifier.verify("11111111"), true)
        assertEquals(verifier.verify("100011010001"), true)
        assertEquals(verifier.verify("1001"), true)
        assertEquals(verifier.verify("0123456768798"), false)
        assertEquals(verifier.verify("0.10.1"), false)
        assertEquals(verifier.verify("01"), false)
        assertEquals(verifier.verify("123abc123"), false)
        assertEquals(verifier.verify("0"), false)
        assertEquals(verifier.verify("100"), false)
        assertEquals(verifier.verify("10"), false)
    }

}