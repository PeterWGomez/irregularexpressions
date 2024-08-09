package org.example

fun main() {
    // Integer tests
    val verifier = IntegerVerifier()
    println("Integer tests")
    println("Valid:")
    println(verifier.verify("12345"))
    println(verifier.verify("12345455469785968990234902190398082883482384848"))
    println("Invalid:")
    println(verifier.verify("0123456768798"))
    println(verifier.verify("0"))
    println(verifier.verify("123abc123"))
    println("-----------------")
    // Float test
    val floatVerifier = FloatVerifier()
    println("Float tests")
    println("Valid:")
    println(floatVerifier.verify("12345"))
    println(floatVerifier.verify("1.01"))
    println(floatVerifier.verify("0.01"))
    println(floatVerifier.verify(".01"))
    println(floatVerifier.verify("15.25"))
    println(floatVerifier.verify(".1"))
    println("Invalid:")
    println(floatVerifier.verify("0123456768798"))
    println(floatVerifier.verify("123abc123"))
    println(floatVerifier.verify("0.10."))

}