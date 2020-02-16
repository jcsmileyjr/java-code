package chp11;

public class Duck extends Animal{
    @Override
    void eat() {
        System.out.println("Ducks eat worms");
    }

    @Override
    void makeSound() {
        System.out.println("Ducks go Quack Quack");
    }
}
