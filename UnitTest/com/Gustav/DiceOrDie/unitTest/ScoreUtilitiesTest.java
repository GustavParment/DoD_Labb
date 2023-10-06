package com.Gustav.DiceOrDie.unitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreUtilitiesTest {

    @Test
    void getHighestScorePlayer() {

        int[] score = {0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};

        int highestScore = score[0];
        int highestScorePlayer = 9;

        for (int i = 1; i < score.length; i++) {

            if (score[i] > highestScore) {
                highestScore = score[i];
                highestScorePlayer = i;





            }
        }
        System.out.println(highestScorePlayer);

        assertEquals(highestScorePlayer, 9);


    }
}