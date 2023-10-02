package com.Gustav.DiceOrDie.Input;

import java.util.Scanner;
/**<font COLOR=#ffffff>
 *The GetData class. This class is instantiated with the Scanner class.
 * The purpose of this class is that it can be used similar to a Scanner.
 * It contains 4 methods getArray(), getInteger() and getString().
 * These methods will get the data type when they ar called upon
 */
public class GetData {
    public Scanner getData;

    public GetData() {

        getData = new Scanner(System.in);

    }

    public String[] getArray() {

        return new String[]{getData.nextLine()};
    }

    public int getInteger() {

        while (!getData.hasNextInt()) {
            System.out.println("Not a number, try again. ");
            getData.next();
        }


        return getData.nextInt();
    }

    public String getString() {

        return getData.nextLine();
    }
}

