package main

/**
 * Lists games with [id] and the [maxPoints] of the game.
 */
enum class Game(val id: Int, val maxPoints: Int){
    Fallout3(0, 40),
    FalloutNewVegas(1, 40),
    Fallout4(2, 28)
}