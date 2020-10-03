package day56_Abstraction.AnimalTask;

public class Bat extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("bat eats");
    }

    @Override
    public void sleep() {
        System.out.println("bat sleeps");

    }

    @Override
    public void fly() {
        System.out.println("bat flies");

    }
}
