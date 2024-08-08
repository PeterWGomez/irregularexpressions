package org.example

class IntegerVerifier {
    lateinit var state: IntegerState

    fun verify(string: String): Boolean {
        state = FirstDigit()
        //for password
        //if (string.length < 8) return false
        string.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is Valid
    }
}