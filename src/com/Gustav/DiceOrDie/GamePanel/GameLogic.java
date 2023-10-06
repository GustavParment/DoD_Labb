package com.Gustav.DiceOrDie.GamePanel;

import com.Gustav.DiceOrDie.PlayerPanel.PlayerLogic;
import com.Gustav.DiceOrDie.Input.GetData;
import com.Gustav.DiceOrDie.PlayerPanel.ScoreUtilities;

/**<font COLOR=#ffffff>
 * The GameLogic class. This class acts as a blueprint for the game.
 * It contains 3 build in methods which are gamePlay(), checkIfTie()
 * and reRoll(). The gamePlay() will set the number of dice
 * and let the players roll the dia by pressing 'ENTER'.
 * The checkIFTie() are crucial for the game
 * to check if there are a tie between 2 or more players.
 * The reRoll() simply checks if there are players with the same score
 * and if that is the case the players with same score will re roll one more round.
 */
public class GameLogic {
    public void newGame(PlayerLogic get) {

        int[] playerScores = new int[get.playerAmount];

        gamePlay(get.playerNames, get.playerAmount, playerScores);

        ScoreUtilities.displayScore(get.playerNames, get.playerAmount, playerScores);

        checkIfTie(get.playerAmount, get.playerNames, playerScores);


    }

    public void gamePlay(String[] playerNames, int playerAmount, int[] score) {

        GetData sc = new GetData();
        Dice dice = new Dice();
        int numDice = dice.numDice();

        for (int round = 1; round <= numDice; round++) {

            System.out.println("\u001B[34m"+"\nThrow dice "+ round + "\u001B[0m");

            for (int i = 0; i < playerAmount; i++) {
                System.out.println("\n" + playerNames[i] + " press "+"\u001B[36m" + "ENTER"
                        + "\u001B[0m"+ " to Dice or " +
                        "\u001B[31m" + "Die!!!" + "\u001B[0m");

                sc.getArray();

                int diceRoll = dice.roll();
                System.out.println(playerNames[i] + " rolled: " + diceRoll);
                score[i] += diceRoll;
            }
        }

    }

    public void checkIfTie( int playerAmount, String[] playerNames,int[] score) {

        ScoreUtilities s = new ScoreUtilities();

        int highestScorePlayer = s.getHighestScorePlayer(score);
        int playersWithHighestScores = s.countPlayersWithScore(score, score[highestScorePlayer]);
        int lowestScorePlayer = s.getLowestScorePlayer(score);


        if (playersWithHighestScores == 2) {

            System.out.println("\u001B[32m" + "\nIt's a tie between 2 players re-roll!" + "\u001B[0m");

            reRoll(playerNames, playerAmount, score);


        } else if (playersWithHighestScores > 2) {

            System.out.println("\u001B[32m" + "\nIt's a tie between multiple players re-roll!" + "\u001B[0m");

            reRoll(playerNames, playerAmount, score);


        }else if (playerAmount == 2){

            System.out.println("\n" + playerNames[highestScorePlayer] + " is the winner and will "+"\u001b[31"
                    +"execute " + playerNames[lowestScorePlayer] );



        }else {

            System.out.println("\n" + playerNames[highestScorePlayer] + " is the winner and will" +
                    "\u001b[31m" + " execute" + "\u001b[0m" + " the other players! ");


        }

    }

    public void reRoll(String[] playerNames, int playerAmount, int[] score) {
        ScoreUtilities s = new ScoreUtilities();
        GetData sc = new GetData();
        Dice dice = new Dice();

        int highestScorePlayer = s.getHighestScorePlayer(score);
        int highestScore = score[highestScorePlayer];
        int lowestScorePlayer = s.getLowestScorePlayer(score);




        for (int i = 0; i <playerAmount; i++) {

            if (score[i] == highestScore){

                System.out.print("\n"+playerNames[i] +
                        " press "+"\u001B[36m" + "ENTER" + "\u001B[0m" + " to re-roll");

                sc.getArray();

                int diceRoll = dice.roll();
                System.out.println("\n"+ playerNames[i] + " rolled: " + diceRoll);
                score[i] += diceRoll;


            }

        }if (playerAmount == 2){

            System.out.println(playerNames[highestScore] + " is the winner and will "+"\u001b[31m"
                    +"execute " + "\u001B[0m" + playerNames[lowestScorePlayer] );



        }else {

            System.out.println(playerNames[highestScorePlayer] + " is the winner and will" +
                    "\u001b[31m" + " execute" + "\u001b[0m" + " the other players! ");


        }

    }

}












