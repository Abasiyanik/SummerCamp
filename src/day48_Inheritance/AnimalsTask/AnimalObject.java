package day48_Inheritance.AnimalsTask;

public class AnimalObject {
    public static void main(String[] args) {
        Dog dog1=new Dog("Tosun", "medium", 3, 'M'," Kangal", 45);
        Dog dog2=new Dog("kucu", "small", 4, 'F',"taba",67);
        System.out.println(dog2.size);
        System.out.println(dog1.name);
        System.out.println(dog1.size);
    dog1.bark();
    dog1.sleep();
    dog1.eat();
        System.out.println(dog1.age);
        System.out.println(dog1.gender);
        System.out.println(dog1);

        Cat cat1=new Cat ("Tabitabi", "fat", 10, 'F', "Balbla", 10);
        System.out.println(cat1);
    }
}
