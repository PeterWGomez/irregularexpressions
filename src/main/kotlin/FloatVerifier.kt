package org.example

class FloatVerifier {
    lateinit var state: FloatState

    fun verify(string: String): Boolean {
        state = FirstFloatDigit()
        //for password
        //if (string.length < 8) return false
        // flag for decimal
        var decimal = false
        string.chunked(1).forEach {
            if (it == ".") {
                println("decimal found")
                println(decimal)
            }
            state.consumeCharacter(it, this)
        }
        return state is FloatValid
    }
}