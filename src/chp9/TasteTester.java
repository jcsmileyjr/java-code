package chp9;

public class TasteTester {
    public static void main(String args) {
        BirthdayCake birthday = new BirthdayCake("Chocolate");
        birthday.setPrice(100.00);
        System.out.println("The flavor of the $" + birthday.getPrice() + " Birthday cake is " + birthday.getFlavor());

        WeddingCake wedding = new WeddingCake("Vanilla");
        wedding.setPrice(500);
        System.out.println("The flavor of the $" + wedding.getPrice() + "Wedding cake is " + wedding.getFlavor());
    }
}
