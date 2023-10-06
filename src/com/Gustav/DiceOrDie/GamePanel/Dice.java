package com.Gustav.DiceOrDie.GamePanel;

import com.Gustav.DiceOrDie.Input.GetData;


import java.util.Random;

/**<font COLOR=#ffffff>
 * The Dice class,when this klass it's Instantiated
 * it will act as a rolling die or get the amount of dice.
 * The class have 2 methods roll() and the numDice().
 * The roll().
 * When it's called upon, the method will act as a rolling dice.
 * The numDice().
 * When it's called upon, it will ask the user how many dice the user wants to play with.
 *
 *
 */
public class Dice {

    public Random random;

    public Dice() {

        random = new Random();

    }

    public int roll() {

        return random.nextInt(10) + 1;
    }

    public int numDice() {

        GetData sc = new GetData();

        System.out.print("Enter amount of dice: ");
        int numDice = sc.getInteger();

        return numDice;

    }

}
