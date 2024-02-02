package main

import kotlin.random.Random

/**
 * Acts like a List to store the attributes
 * @param game the id of Fallout the game as according to enum [Game]
 */
class SPECIAL (private var game: Int)
{
    //Cant be null
    private var maxPoints : Int = 0

    private val MIN_ATTRIBUTE_POINTS_COUNT = 1
    private val MAX_ATTRIBUTE_POINTS_COUNT = 10

    private val attributes = Array<Int>(7) {0}
    private val attributesNames: List<String> = listOf("Strength", "Perception", "Endurance", "Charisma",
        "Intelligence", "Agility", "Luck")



    /**
     * Used by [randomlyIncrement] and/or [randomlyDecrement] to check if an index of [attributes] should be ignored
     * since it cannot be incremented or decremented.
     */
    private var ignoreIndex = -1 //could have a list of indices to ignore, but I don't think itd save much time randomly modifying number attributes

    //Sets the max points
    init {
        when (game)
        {
            Game.Fallout3.id -> maxPoints = Game.Fallout3.maxPoints
            Game.FalloutNewVegas.id -> maxPoints = Game.FalloutNewVegas.maxPoints
            Game.Fallout4.id -> maxPoints = Game.Fallout4.maxPoints
        }
    }

    /**
     * Makes it so the object property [attributes] can be used like an array
     * @see attributes
     */
    operator fun get(index: Int): Int {
        if (index in 0 until 7) {
            return attributes[index]
        } else {
            throw IndexOutOfBoundsException("Index $index out of bounds for Special")
        }
    }

    operator fun set(index: Int, value: Int) {
        if (index in 0 until 7) {
            attributes[index] = value
        } else {
            throw IndexOutOfBoundsException("Index $index out of bounds for Special")
        }
    }

    /**
     * Converts the attributes to a string with the format of
     *
     */
    override fun toString() : String
    {
        var stringToReturn = ""

        for (attributeIndex in attributes.indices) //need .indices for some reason
        {
            var attribute = attributes[attributeIndex]
            var attributeName = attributesNames[attributeIndex]
            stringToReturn = "$stringToReturn$attributeName: $attribute \n"
        }
        return stringToReturn
    }

    /**
     * Generates the numbers for the attributes
     */
    fun randomiseAttributes()
    {
        generateAndSetRandomAttributes()
        adjustAttributesTotal()
    }

    /**
     * Generates and sets the *unbalanced* numbers for [attributes]
     */
    fun generateAndSetRandomAttributes()
    {

        for (i in MIN_ATTRIBUTE_POINTS_COUNT..MAX_ATTRIBUTE_POINTS_COUNT)
        {
            // +1 needed to make it inclusive so it can generate 10
            attributes[i] = Random.nextInt(MIN_ATTRIBUTE_POINTS_COUNT, MAX_ATTRIBUTE_POINTS_COUNT + 1)
        }


    }

    /**
     * Checks the numbers to see if the [attributes] total equals [maxPoints]
     */
    private fun doPointsEqualsMax():Boolean
    {
        val total = attributes.sum()
        if (total != maxPoints)
        {
            return false
        }
        return true
    }

    /**
     * Adjusts the elements in [attributes] so the sum of [attributes] is equal to [maxPoints]
     */
    private fun adjustAttributesTotal()
    {
        do
        {
            if (attributes.sum() > maxPoints) {randomlyDecrement()}
            if (attributes.sum() < maxPoints) {randomlyIncrement()}
            if (attributes.sum() == maxPoints) {break}
        } while(!doPointsEqualsMax())

    }

    /**
     * Decrements a random value in the [attributes] array to bring [attributes] sum to the [maxPoints]
     */
    private fun randomlyDecrement()
    {
        //loop or recursion. recursion causes nested calls which i tricky to navigate
        //neither, just don't nest calls, put ignore index in class wide variable and return if you can inc/dec
        val index = Random.nextInt(0, 6+1)
        if (attributes[index] - 1 < MIN_ATTRIBUTE_POINTS_COUNT)
        {
            ignoreIndex = index
            return
        }
        ignoreIndex = -1
        attributes[index]--

    }

    /**
     * Increments a random value in the [attributes] array to bring [attributes] sum to the [maxPoints]
     */
    private fun randomlyIncrement()
    {
        val index = Random.nextInt(0, 6+1)
        if (attributes[index] + 1 > MAX_ATTRIBUTE_POINTS_COUNT)
        {
            ignoreIndex = index
            return
        }
        ignoreIndex = -1
        attributes[index]++

    }

}

