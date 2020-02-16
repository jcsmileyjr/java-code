package chp11;

public class Farm {
    public static void main(String[] args) {
        Animal duck = new Duck();
        duck.makeSound();
        duck.eat();

        Animal pig = new Pig();
        pig.makeSound();
        pig.eat();
    }
}
