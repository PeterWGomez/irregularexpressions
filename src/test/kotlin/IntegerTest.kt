import org.example.IntegerVerifier
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IntegerTest {
    @Test
    fun testInteger() {
        val verifier = IntegerVerifier()
        assertEquals(verifier.verify("12345"), true)
        assertEquals(verifier.verify("12345455469785968990234902190398082883482384848"), true)
        assertEquals(verifier.verify("0123456768798"), false)
        assertEquals(verifier.verify("0"), false)
        assertEquals(verifier.verify("123abc123"), false)
    }

}