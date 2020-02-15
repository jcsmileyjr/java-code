package chp4;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        int numberOfDiceRolls = 5;
        int numberOfSpaces = 20;
        int userCurrentSpot = 0;
        int spacesLeft = 0;

        Random random = new Random();

        for(int i=0;i<numberOfDiceRolls;i++){
            int die = random.nextInt(6) + 1;
            userCurrentSpot += die;

            if(userCurrentSpot > 20){
                System.out.println("You Lose, you roll to many");
                break;
            }
            spacesLeft = 20 - userCurrentSpot;

            System.out.println("Rolling Dice for #" + die
            + " and moved to spaced " + userCurrentSpot + ". You have "
            + spacesLeft + " more to go.");

            if(userCurrentSpot == numberOfSpaces && i<= numberOfDiceRolls){
                System.out.println("On spot 20, You Won");
                break;
            }
        }

        if(userCurrentSpot < 20){
            System.out.println("You Lose, didn't make it to the end");
        }
    }
}
