package chp3;

import java.util.Scanner;

public class CountingChange {

    public static void main(String[] args) {
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        double dollar = 1.0;

        //Ask user to enter quanties for pennies, nickels, dime, quarters to creatge $1
        System.out.println("Lets count change up to a $1");

        System.out.println("How many pennies to use?");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextDouble();

        System.out.println("How many nickels to use?");
        double nickels = scanner.nextDouble();

        System.out.println("How many dimes to use?");
        double dimes = scanner.nextDouble();

        System.out.println("How many quarters to use?");
        double quarters = scanner.nextDouble();
        scanner.close();

        //count the money
        double value = (pennies * penny) + (nickel * nickels) + (dime * dimes) + (quarter * quarters);
        double amountOff;

        //if $1, then win, if more, tell by how much over, sam with over
        if(value  == dollar){
            System.out.println("You won");
        }else if(value > dollar){
            amountOff = value - dollar;
            System.out.println("You are $" + amountOff + " over.");
        }else {
            amountOff = dollar - value;
            System.out.print("Your are $" + amountOff + " under");
        }
        //System.out.println("The value is $" + value);
    }
}
