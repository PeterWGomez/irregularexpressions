package org.example

class BinaryValid: BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier, lastLetter: String) {
        if (char !in "01") {
            binaryVerifier.state = BinaryInvalid()
        }
        if (lastLetter != "1") {
            binaryVerifier.state = BinaryInvalid()
        }
    }
}