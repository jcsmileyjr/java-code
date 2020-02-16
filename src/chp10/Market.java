package chp10;
/*
Create a Fruit class that contains a calorie field and makeJuice();
Create 2 subclasses that have their own methods, constructors set the calories,
and override the makeJucie().
Create a Market class that test polymorphism by creating several variations
 */

public class Market {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.removeSeeds();

        Banana banana = new Banana();
        banana.peel();

        Fruit smoothie = new Banana();
        smoothie.makeJuice();

        smoothie = new Apple();
        smoothie.makeJuice();

        ((Apple)smoothie).removeSeeds();
    }
}
