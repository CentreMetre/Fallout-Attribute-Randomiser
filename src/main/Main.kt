package main

val Attributes = Array<Int>(7) {0}
fun main() {

    var fallout3 = Special(1)

    fallout3[0] = 5
    fallout3[1] = 5
    fallout3[2] = 5

    var total = fallout3.sum()

    print(fallout3)

    println(total)

    fallout3.randomiseAttributes()
}