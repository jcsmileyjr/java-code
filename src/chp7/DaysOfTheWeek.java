package chp7;

import java.util.Scanner;

public class DaysOfTheWeek {
    static String [] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        System.out.println("Input a number from 1-7");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        scanner.close();

        switch(target){
            case 1:
                System.out.println(daysOfTheWeek[0]);
                break;
            case 2:
                System.out.println(daysOfTheWeek[1]);
                break;
            case 3:
                System.out.println(daysOfTheWeek[2]);
                break;
            case 4:
                System.out.println(daysOfTheWeek[3]);
                break;
            case 5:
                System.out.println(daysOfTheWeek[4]);
                break;
            case 6:
                System.out.println(daysOfTheWeek[5]);
                break;
            case 7:
                System.out.println(daysOfTheWeek[6]);
                break;
            default:
                System.out.println("You inputted a incorrect number");
                break;
        }

    }


}
