package chp3;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        System.out.println("What is your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();
/*
        if(grade >= 90){
            System.out.println(" A");
        }else if(grade >= 80 && grade <90){
            System.out.println("B");
        }else if(grade >=70 && grade < 80){
            System.out.println("C");
        }else if(grade >= 60 && grade < 70){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
 */

        char grade;

        if(score < 60) {
            grade = 'F';
        }else if(score < 70){
            grade = 'D';
        }else if(score < 80) {
            grade = 'C';
        }else if(score < 90){
            grade = 'B';
        }else{
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}
