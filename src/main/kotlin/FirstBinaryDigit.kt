package org.example

class FirstBinaryDigit : BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        if (char in "1") {
            binaryVerifier.state = BinaryValid()
        } else {
            binaryVerifier.state = BinaryInvalid()
        }
    }
}