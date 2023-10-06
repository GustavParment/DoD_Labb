package com.Gustav.DiceOrDie.PlayerPanel;

/**<font COLOR=#ffffff>
 * The ScoreUtilities class is used for counting the score between players.
 * it contains 3 methods getHighestPlayerScore(), displayScore() and getWinnerScore()
 * These are functions that calculates score the value.
 * The displayScore() will simply display the scores in the console.
 *
 */
public class ScoreUtilities {

    public int getHighestScorePlayer(int[] score) {

        int highestScore = score[0];
        int highestScorePlayer = 0;

        for (int i = 1; i < score.length; i++) {
            if (score[i] > highestScore) {
                highestScore = score[i];
                highestScorePlayer = i;
            }

        }

        return highestScorePlayer;
    }

    public static void displayScore(String[] playerNames, int playerAmount, int[] score) {
        for (int i = 0; i < playerAmount; i++) {

            System.out.println("\n" + playerNames[i] + "\u001B[33m" + " score:" + "\u001B[0m" + " " + score[i]);

        }
    }

    public int countPlayersWithScore(int[] scores, int targetScore) {
        int count = 0;
        for (int score : scores) {
            if (score == targetScore) {
                count++;
            }
        }
        return count;
    }
}

