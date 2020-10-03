package day48_Inheritance.AnimalsTask;

public class Animal {
    public String name;
    public String size;
    public int age;
    public char gender;
    public String breed;
    public double lb;

//    public Animal(String name, String size, int age, char gender, String breed, double lb) {
//        this.name = name;
//        this.size = size;
//        this.age = age;
//        this.gender = gender;
//        this.breed = breed;
//        this.lb = lb;
//    }

    public void setInfo(String name, String size, int age, char gender, String breed, double lb ) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.gender = gender;
        this.breed=breed;
        this.lb=lb;
    }

    public void eat (){
        System.out.println(name+" is eating");
    }

    public void sleep() {
        System.out.println(name+ " is sleeping ");
    }

    @Override
    public String toString() {
        return "name: " + name + "\n=================" +
                "\nsize=" + size +", age=" + age +", gender: " + gender+", breed: "+breed+", weight: "+lb+" lb"+
                "\n================================";

    }
}
