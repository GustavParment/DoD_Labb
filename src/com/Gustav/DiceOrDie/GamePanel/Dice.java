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

        return random.nextInt(6) + 1;
    }

    public int numDice() {

        int diceAmount;

        do {

            GetData sc = new GetData();

            System.out.print("Enter amount of dice: ");
            diceAmount = sc.getInteger();

            if (diceAmount <= 0) {

                System.out.println("\u001B[31m"+"You need at least 1 die to play..."+"\u001B[0m");
            }
            else{

                break;

            }



        } while (diceAmount <= 0);

        return diceAmount;
    }

}
