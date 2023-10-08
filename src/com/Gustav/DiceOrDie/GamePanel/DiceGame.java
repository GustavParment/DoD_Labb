package com.Gustav.DiceOrDie.GamePanel;

import com.Gustav.DiceOrDie.Input.GetData;
import com.Gustav.DiceOrDie.PlayerPanel.PlayerLogic;

/**<font COLOR=#ffffff>
 * This class starts the game when it's called upon from Main.
 * It contains an instance of the GetData class and a String variable.
 * The game itself is wrapped inside a do while loop that will keep the game running,
 * if the user choose to type 'new game' or it will close the game if the user
 * push any key.
 *
 */

public class DiceGame {

    public DiceGame(){

        startMenu();

    }

    private void restartOptionMessage(){

        System.out.print("\u001B[35m" + "\nTo start a new game type " + "\u001B[33m" + "New game"+ "\u001B[0m"+
                "\u001b[35m" +" or type "+
                "\u001B[36m" + "Exit" + "\u001B[0m" + "\u001B[35m" + " to exit: " +"\u001B[0m");



    }

    private void startOptionMessage(){

        System.out.print("Welcome to" + "\u001b[31m" + " Dice or Die!"+"\u001b[0m"+
                "\u001B[35m" + "\nType "+"\u001B[33m" + "S"+"\u001B[0m" + "\u001B[35m" + " to start or press "
                + "\u001B[36m" + "Exit"
                + "\u001B[0m"+ "\u001B[35m"+" to exit: " + "\u001b[0m");


    }

    private void startMenu(){

        GetData sc = new GetData();
        String restartGame;

        startOptionMessage();
        String s = sc.getString();


        if (s.equalsIgnoreCase("s")){


            do {

                PlayerLogic play = new PlayerLogic();

                GameLogic game = new GameLogic();

                game.newGame(play);

                restartOptionMessage();

                restartGame = sc.getString();

            }while(restartGame.equalsIgnoreCase("new game"));

        }
        else{

            System.out.println("\nI see you ain't got the balls to" +"\u001b[31m" + " Dice or Die... " + "\u001b[0m");
        }

        System.exit(0);
    }
}

