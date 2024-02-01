package main

import kotlin.random.Random

val Attributes = Array<Int>(7) {0}
fun main() {


    var num1 = 4
    var num2 = 2
    num2 += num1

    println(num2)

    generateRandomAttributes()
    doPointsEqualsMax()

}

fun generateRandomAttributes()
{
    val minAttributePointsCount = 1
    val maxAttributePointsCount = 10

    for (i in 0..6)
    {

        // +1  needed to make it inclusive so it ca generate 10
        Attributes[i] = Random.nextInt(minAttributePointsCount, maxAttributePointsCount + 1)
    }
}

fun doPointsEqualsMax():Boolean
{
    var total = 0
    for (attribute in 0..6)
    {
        total += Attributes[attribute]
    }
//        if (total != )
//        {
//            return false
//        }
    println(total)
    return true
}