package com.Gustav.DiceOrDie.PlayerPanel;

import com.Gustav.DiceOrDie.Input.GetData;

/**<font COLOR=#ffffff>
 * The PlayerLogic klass acts as a storage for storing playerAmount and PlayerName.
 * It also contains a for loop that will generate name input based on the playerAmount.
 * To handel the data this class got an instance of the GetData class.
 * The containsDigits() will check if the user inputs chars that contains digits.
 *
 */

public class PlayerLogic {

    GetData sc = new GetData();

    public int playerAmount;
    public  String[] playerNames;

    public PlayerLogic(){

        getPlayerAmount();

        sc.getString();

        getPlayerNames();

    }

    public void getPlayerAmount(){

        do {

            System.out.print("Enter number of players: ");
            playerAmount =  sc.getInteger();

            if (playerAmount >= 5){
                System.out.println("\u001B[31m" + "Maximum amount of players is 4..."+"\u001B[0m");

            } else if (playerAmount < 2) {
                System.out.println("\u001B[31m" + "You need to be at least 2 players... "+"\u001B[0m");

            }

        } while (playerAmount >= 5 || playerAmount < 2);
    }

    public void getPlayerNames() {

        playerNames = new String[this.playerAmount];

        for (int i = 0; i < playerAmount; i++) {
            boolean containsDigits;


            do {

                System.out.print("Enter player name: ");
                playerNames[i] = sc.getString();
                containsDigits = containsDigits(playerNames[i]);


                if (containsDigits) {
                    System.out.println("\u001B[31m" + "That's a number, you can only enter letters for player names..."
                            + "\u001B[0m");
                }


            } while (containsDigits);
        }

    }

    public boolean containsDigits(String text){

        for (char c : text.toCharArray()){

            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

}
