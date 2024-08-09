package org.example

class FirstIntegerDigit : IntegerState {
    override fun consumeCharacter(char: String, integerVerifier: IntegerVerifier) {
        if (char in "123456789") {
            integerVerifier.state = IntegerValid()
        } else {
            integerVerifier.state = IntegerInvalid()
        }
    }
}