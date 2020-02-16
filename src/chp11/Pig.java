package chp11;

public class Pig extends Animal {
    @Override
    void makeSound() {
        System.out.println("Pig says Oink Oink");
    }

    @Override
    void eat() {
        System.out.println("Pig eat slop");
    }
}
