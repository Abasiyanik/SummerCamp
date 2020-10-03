package day48_Inheritance.AnimalsTask;

public class Cat extends Animal {

    public Cat(String name, String size, int age, char gender, String breed,  double lb){
        setInfo(name, size, age, gender, breed, lb); }

    public void meow(){
        System.out.println(name+ " is meowing");
    }






}
