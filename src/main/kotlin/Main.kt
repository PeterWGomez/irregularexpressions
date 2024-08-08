package org.example

fun main() {
    // Integer tests
    val verifier = IntegerVerifier()
    println(verifier.verify("12345"))
    println(verifier.verify("12345455469785968990234902190398082883482384848"))
    println(verifier.verify("0123456768798"))
    println(verifier.verify("0"))
    println(verifier.verify("123abc123"))
    // Float test

}