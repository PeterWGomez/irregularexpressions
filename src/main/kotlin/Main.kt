package org.example

fun main() {
    // Integer tests
    val verifier = IntegerVerifier()
    println(verifier.verify("12345"))
    println(verifier.verify("12345455469785968990234902190398082883482384848"))
    println(verifier.verify("0123456768798"))
    println(verifier.verify("0"))
    println(verifier.verify("123abc123"))
    println("-----------------")
    // Float test
    val floatVerifier = FloatVerifier()
    println(floatVerifier.verify("12345"))
    println(floatVerifier.verify("0.01"))
    println(floatVerifier.verify("0123456768798"))
    println(floatVerifier.verify(".01"))
    println(floatVerifier.verify("123abc123"))

}