package day56_Abstraction.AnimalTask;

public class Penguin extends Animal implements Swimmable, Playable{

    @Override
    public void eat() {
        System.out.println("penguin eats");
    }

    @Override
    public void sleep() {
        System.out.println("penguin sleeps");

    }

    @Override
    public void play() {
        System.out.println("penguin can play");

    }

    @Override
    public void swim() {
        System.out.println("penguin swims");

    }
}
