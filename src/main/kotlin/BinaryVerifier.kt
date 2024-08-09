package org.example

class BinaryVerifier {
    lateinit var state: BinaryState

    fun verify(string: String): Boolean {
        state = FirstBinaryDigit()
        //for password
        //if (string.length < 8) return false
        string.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is BinaryValid
    }
}