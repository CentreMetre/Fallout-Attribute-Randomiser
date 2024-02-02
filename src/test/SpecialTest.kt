package test

import main.*
import kotlin.test.Test
import kotlin.test.assertEquals

class SpecialTest {
    private val testSample: Special = Special(0)
    @Test
    fun testToString() {

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

    @Test
    fun testSum()
    {
        testSample[0] = 5
        testSample[1] = 5
        testSample[2] = 5
        var actual = testSample.sum()
        var expected = 15
        print(testSample)
        assertEquals(expected,actual)

    }

    @Test
    /**
     * Checks the final [Special.attributes] total against the chosen [Game]s [Special.maxPoints]
     */
    fun testRandomiseAttributesFallout3() {
        var fallout3 = Special(0)
        fallout3.randomiseAttributes()
        var expected = true
        var actual = if (fallout3.sum() == Game.Fallout3.maxPoints) true else false
        assertEquals(expected, actual)
    }

    @Test
    /**
     * Checks the final [Special.attributes] total against the chosen [Game]s [Special.maxPoints]
     */
    fun testRandomiseAttributesFalloutNV() {
        var falloutNV = Special(1)
        falloutNV.randomiseAttributes()
        var expected = true
        var actual = if (falloutNV.sum() == Game.FalloutNewVegas.maxPoints) true else false
        assertEquals(expected, actual)
    }

    @Test
    /**
     * Checks the final [Special.attributes] total against the chosen [Game]s [Special.maxPoints]
     */
    fun testRandomiseAttributesFallout4() {
        var fallout4 = Special(2)
        fallout4.randomiseAttributes()
        var expected = true
        var actual = if (fallout4.sum() == Game.Fallout4.maxPoints) true else false
        assertEquals(expected, actual)
        println(fallout4)
        println(fallout4.sum())
    }

}