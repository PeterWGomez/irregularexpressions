package org.example

class BinaryValid: BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        if (char !in "0123456789") {
            binaryVerifier.state = BinaryInvalid()
        }
    }
}