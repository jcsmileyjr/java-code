package chp3;

import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        int loanMinimal = 30000;
        int yearsWorkedMinimal = 2;

        System.out.println("What is your annal income in increments of 10000");
        Scanner scanner = new Scanner(System.in);
        double annualIncome = scanner.nextDouble();

        System.out.println("What is the number of years you have worked?");
        double yearsWorked = scanner.nextDouble();
        scanner.close();

        if(annualIncome > loanMinimal){
            if(yearsWorked > yearsWorkedMinimal){
                System.out.println("You have qualified!!");
            }else{
                System.out.println("Sorry you must have worked more then then "
                        + yearsWorkedMinimal + " to qalify");
            }
        }else{
          System.out.println("You must earn more then " + loanMinimal);
        }

    }
}
