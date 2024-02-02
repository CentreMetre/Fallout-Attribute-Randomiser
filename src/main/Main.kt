package main

private var attributes: Special = Special(Game.Fallout3)

private val GAME_LIST =
        "[0] Fallout 3\n" +
        "[1] Fallout: New Vegas\n" +
        "[2] Fallout 4\n"

fun main() {

    println("What fallout game would you like to generate attribute for?\n$GAME_LIST")
    inputGame()

    attributes.randomiseAttributes()
    print(attributes)

    println("Press enter to quit")
    readln()
}

private fun inputGame()
{
    val chosen = readln()

    when (chosen)
    {
        "0" -> attributes = Special(Game.Fallout3)
        "1" -> attributes = Special(Game.FalloutNewVegas)
        "2" -> attributes = Special(Game.Fallout4)
        else -> {
            println("\n Invalid input\n $GAME_LIST")
            inputGame()
        }
    }

}

