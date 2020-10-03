package day56_Abstraction.AnimalTask;

public class Turtle extends Animal implements Swimmable {

    @Override
    public void eat() {
        System.out.println("turtle eats");
    }

    @Override
    public void sleep() {
        System.out.println("turtle sleeps");

    }

    @Override
    public void swim() {
        System.out.println("turtle swims");

    }
}
