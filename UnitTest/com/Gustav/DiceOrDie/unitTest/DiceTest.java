package com.Gustav.DiceOrDie.unitTest;

import com.Gustav.DiceOrDie.GamePanel.Dice;
import org.junit.jupiter.api.Test;





class DiceTest {

    @Test
    void checkRollScore() {
        Dice dice = new Dice();

        for (int i = 0; i < 10 ; i++) {

            System.out.println(dice.roll());

        }

    }
}