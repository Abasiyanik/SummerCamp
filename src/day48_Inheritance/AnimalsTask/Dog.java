package day48_Inheritance.AnimalsTask;

public class Dog extends Animal {
    // sub (Child)     super (parent)
/*
    variable: 4 name, age, size, gender
    method: 3 (eat, sleep and braking
 */

    public Dog(String name, String size, int age, char gender, String breed, double lb){
        setInfo(name, size, age, gender, breed, lb);
    } // constructor yapildi ve olay bitti






    public void bark(){

        System.out.println(name+" barking");
    }



}
