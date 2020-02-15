package chp5;

import java.util.Scanner;

public class CalculatePhoneBill {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the plan fee");
        double planFee = scanner.nextDouble();

        System.out.println("How many minutes did you go over?");
        int overageMinutes = scanner.nextInt();

        scanner.close();

        double overageFees = calculateOverageFee(overageMinutes);

        double taxesOwed = calculateTax(planFee, overageFees);

        double finalTotal = calculateFinalTotal(taxesOwed, planFee, overageFees);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", planFee));
        System.out.println("Overage: $" + String.format("%.2f", overageFees));
        System.out.println("Taxes: $" + String.format("%.2f", taxesOwed));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }

    public static double calculateOverageFee( int minutesOver){
        double overageRate = .25;
        double overageFee = minutesOver * overageRate;
        return overageFee;

    }

    public static double calculateTax(double planFee, double overages){
        double taxRate = .15;
        double subTotal = (planFee + overages) * taxRate;
        return subTotal;
    }

    public static double calculateFinalTotal(double taxes, double planFee, double overages){
        double finalTotal = taxes + planFee + overages;
        return finalTotal;
    }

}
