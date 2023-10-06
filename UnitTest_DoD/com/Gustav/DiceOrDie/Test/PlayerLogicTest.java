package com.Gustav.DiceOrDie.Test;

import com.Gustav.DiceOrDie.PlayerPanel.PlayerLogic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerLogicTest {

    @Test
    void getPlayerNames() {


        String[] playerNames = {"Kristoffer", "Benny", "1337", "Dragon Slayer"};

        boolean[] result = {false, false , true, false };


        for (int i = 0; i < playerNames.length; i++) {

            boolean containsDigits = containsDigits(playerNames[i]);
            assertEquals(result[i], containsDigits );


        }
    }
       boolean containsDigits(String text) {

        for(char c : text.toCharArray()){

            if (Character.isDigit(c)){

                return true;

            }
        }
        return false;

    }
}

