package chp3;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        //initialize known values
        int salary = 1000;
        int bonus  = 250;


        //get unknown values
        System.out.println("How many sales did the employee make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //logic

        if(sales > 10){
            salary = salary + bonus;
        }
        System.out.println("The employee's pay is $" + salary );
    }
}
