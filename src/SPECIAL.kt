import java.util.jar.Attributes
import kotlin.random.Random

class SPECIAL
{
    private val Attributes = Array<Int>(7) {0}
    private val AttributesNames: List<String> = listOf("Strength", "Perception", "Endurance", "Charisma",
        "Intelligence", "Agility", "Luck")
    /**
     * Makes it so the object property [Attributes] can be used like an array
     * @see Attributes
     */
    operator fun get(index: Int): Int {
        if (index in 0 until 7) {
            return Attributes[index]
        } else {
            throw IndexOutOfBoundsException("Index $index out of bounds for Special")
        }
    }

    operator fun set(index: Int, value: Int) {
        if (index in 0 until 7) {
            Attributes[index] = value
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
        return ""
    }

    /**
     * Generates the **UNBALANCED** numbers for the attributes
     * @return
     */
    fun generateNumbers()
    {
        val x = 7
        val y = 1
        val z = 10

        var randomNumbers = List(x) {
            Random.nextInt(y, z + 1 /* +1 makes it inclusive for some reason*/)
        }

    }

}

