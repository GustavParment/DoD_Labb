package com.Gustav.DiceOrDie;

import com.Gustav.DiceOrDie.GamePanel.GameLogic;
//import com.Gustav.DiceOrDie.GamePanel.Start;
import com.Gustav.DiceOrDie.PlayerPanel.PlayerLogic;

/**<font COLOR=#ffffff>
 * Dice or Die!
 * This is a die game where the users will roll for there lives.
 * The lowest score players will get executed.
 * There can only be upp to 4 players playing.
 * If 2 players or more gets the same score they will battle once more.
 * Are you brave enough to play?
 * The choice is yours to either Dice or Die?
 */
public class Main {
    public static void main(String[] args) {

       // new Start();

        PlayerLogic play = new PlayerLogic();
        GameLogic game = new GameLogic();

        game.newGame(play);
    }
}

