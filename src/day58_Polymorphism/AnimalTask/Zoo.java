package day58_Polymorphism.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1=new Dog("Winstong", 4, 'M');
        dog1.sleep();
        dog1.eat();
        dog1.bark();
        //polymorphisimle nasil olur
        System.out.println(dog1.dogName);
        System.out.println(dog1.age);
        System.out.println(dog1.gender);

        System.out.println("=======================================");
        Animal animal2=new Dog("Grizzly", 3, 'F');
        //inthe reference type yani animal da sadece sleep ve eat var
        animal2.sleep();
        animal2.eat();
        /*
        animal2.bark(); // bu calismaz cunku reference type da bu metod yok. dolayisiyla
        exection olmaz.
        ((Dog) animal2).bark();// bark olmadigi icin bu hale donuystuyoruz.
         System.out.println(animal2.dogName); //dogName reference type da olmadigi icin ne yazik ki yazilmaz
         System.out.println(((Dog) animal2).dogName);///ancak bu halde yazilabilir
        */

        System.out.println(animal2.age);
        System.out.println(animal2.gender);
        System.out.println(animal2);//toString method Dogtan calisir. parent ve child da olan bu overridden method
        /*
         always overridden olan child yani dog class tan cagrilir
        eger yazmamis olsaydik parenttan yani refernce class tan olacakti ti it da ti ti
        */
    }
}
