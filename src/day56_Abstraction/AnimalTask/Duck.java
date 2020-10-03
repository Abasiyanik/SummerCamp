package day56_Abstraction.AnimalTask;

public class Duck extends Animal implements Flyable, Swimmable, Playable {
    @Override
    public void eat() {
        System.out.println("duck eats");

    }

    @Override
    public void sleep() {
        System.out.println("dock sleeps");

    }

    @Override
    public void fly() {
        System.out.println("duck flies");

    }

    @Override
    public void swim() {
        System.out.println("duck swim");

    }

    @Override
    public void play() {
        System.out.println("duck can play");

    }
}
