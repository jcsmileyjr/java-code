package chp9;
/*
Cake Cake Cake
Create an application that has a super-class named Cake. Then have two sub
classes named BirthdayCake and WeddingCake. Then create a TasteTaster class
that test out the inheritance of the sub classes.
 */

public class TasteTester {
    public static void main(String [] args) {
        BirthdayCake birthday = new BirthdayCake("Chocolate");
        birthday.setPrice(100.00);
        System.out.println("The flavor of the $" + String.format("%.2f", birthday.getPrice()) + " Birthday cake is " + birthday.getFlavor());

        WeddingCake wedding = new WeddingCake("Vanilla");
        wedding.setPrice(500);
        System.out.println("The flavor of the $" + String.format("%.2f", wedding.getPrice()) + " Wedding cake is " + wedding.getFlavor());
    }
}
