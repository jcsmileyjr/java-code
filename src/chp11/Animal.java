package chp11;
/*
- Learning about Abstraction
- Create a abstract class name Animal, abstract method and a non-abstract
method.
- Create a Pig and Duck class that extends Animal
- Create a Farm class to test implementations.
 */

public abstract class Animal {
    abstract void makeSound();
    void eat(){
        System.out.println("Eat food");
    }

}
