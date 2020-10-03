package day56_Abstraction.AnimalTask;

public class Eagle extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("eagle eats");

    }

    @Override
    public void sleep() {
        System.out.println("eagle sleeps");

    }

    @Override
    public void fly() {
        System.out.println("eagle flies");

    }
}
