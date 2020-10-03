package day56_Abstraction.AnimalTask;

public class Parrot extends Animal implements Playable, Flyable, Talkative {

    @Override
    public void eat() {
        System.out.println("Parrot is eating");

    }

    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping");

    }

    @Override
    public void fly() {
        System.out.println("parrot is flying");

    }

    @Override
    public void play() {
        System.out.println("parrot can play");

    }


    @Override
    public void talk() {
        System.out.println("parrot can talk");

    }
}

