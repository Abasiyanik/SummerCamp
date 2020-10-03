package day56_Abstraction.AnimalTask;

public class Snake extends Animal implements Swimmable{

    @Override
    public void eat() {
        System.out.println("snake eats");

    }

    @Override
    public void sleep() {
        System.out.println("snake sleeps");

    }

    public void swim(){
        System.out.println("snake swimd");
    }
}
