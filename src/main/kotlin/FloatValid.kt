package org.example

class FloatValid: FloatState {
    override fun consumeCharacter(char: String, floatVerifier: FloatVerifier, firstChar: String, letterCounter: Int, decimalCount: Int) {
        if (char !in "0123456789.") {
            floatVerifier.state = FloatInvalid()
        }
        if (char !in "." && firstChar == "0" && letterCounter == 2) {
            floatVerifier.state = FloatInvalid()
        }
        if (char in "." && decimalCount == 1) {
            floatVerifier.state = FloatInvalid()
        }

    }
}