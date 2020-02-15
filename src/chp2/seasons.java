package chp2;


import java.util.Scanner;

public class seasons {
    public static void main(String[] args){
        //Ask user for season of the year
        System.out.println("Type a season of a year?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //A whole number
        System.out.println("Type a whole number?");
        int number = scanner.nextInt();

        //A adjective
        System.out.println("Type a adjective?");
        String adjective = scanner.next();

        //complete the sentence
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }
}
