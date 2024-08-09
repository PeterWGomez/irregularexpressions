package org.example

class SecondFloatDigit: FloatState {
    override fun consumeCharacter(char: String, floatVerifier: FloatVerifier, firstChar: String, letterCounter: Int, decimalCount: Int) {
        if (char in "1234567890.") {
            floatVerifier.state = FloatValid()
        } else {
            floatVerifier.state = FloatInvalid()
        }
    }
}