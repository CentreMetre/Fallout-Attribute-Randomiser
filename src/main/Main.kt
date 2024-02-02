package main

val Attributes = Array<Int>(7) {0}
fun main() {

    var testSample = SPECIAL(1)
    println(testSample.toString())
    testSample[0] = 5
    testSample[1] = 3
    println(testSample[0])

    println(testSample[1])

    println(testSample.toString())
}