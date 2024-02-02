package test

import main.SPECIAL
import kotlin.test.Test
import kotlin.test.assertEquals

class SPECIALTest {
    private val testSample: SPECIAL = SPECIAL(0)
    @Test
    fun testToString()
    {

        val expected =
                "Strength: 0 \n" +
                "Perception: 0 \n" +
                "Endurance: 0 \n" +
                "Charisma: 0 \n" +
                "Intelligence: 0 \n" +
                "Agility: 0 \n" +
                "Luck: 0 \n"
        val actual = testSample.toString()
        println(expected)
        println("\n")
        println(actual)
        assertEquals(expected, actual)
    }


}