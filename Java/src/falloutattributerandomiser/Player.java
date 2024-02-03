package falloutattributerandomiser;

import FalloutGame.*;

/**
 * The player holds all of the attributes and traits
 * @since 0.1.0.2.1
 * @version 0.1
 * @author Martin McLaren
 */
public class Player {
    /**
     * Name of the player. Optional.
     */
    private String playerName;
    
    /**
     * The game that the player picks.
     */
    private Fallout game;

    public Player(String playerName, Fallout game)
    {
        this.playerName = playerName;
        this.game = game;
    }
    
    
    
}
