package org.example

class FloatVerifier {
    lateinit var state: FloatState

    fun verify(string: String): Boolean {
        state = FirstFloatDigit()
        var letterCounter = 0
        //for password
        //if (string.length < 8) return false
        var firstLetter = string.first().toString()
        var decimalCount = 0
        string.chunked(1).forEach {
            letterCounter++
            state.consumeCharacter(it, this, firstLetter, letterCounter, decimalCount)
            if (it == ".") {
                decimalCount++
            }
        }
        return state is FloatValid
    }
}