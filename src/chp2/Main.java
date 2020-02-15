package chp2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//1. Get the number of hours worked
    System.out.println("Enter the number of hours the employee worked.");
    Scanner scanner = new Scanner(System.in);
    int hours =scanner.nextInt();

    //Get the hourly pay rate
    System.out.println("Enter the hourly wage of the employee");
    double wage = scanner.nextDouble();

    //Multiply hours and pay rate
    double grossPay = hours * wage;

    //display the results
    System.out.println("The gross page of the employee is $" + grossPay + ".00");
    }
}
