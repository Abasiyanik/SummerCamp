package day58_Polymorphism;
import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;
import day58_Polymorphism.*;
import day58_Polymorphism.AnimalTask.*;

public class TypeCasting {
    public static void main(String[] args) {
        int u=4;
        double hu=u;

        Dog dog1=new Dog ("A", 2,'M');
        Cat cat1=new Cat ("B", 4,'F');
        Cat cat3=new Cat("hgh", 5, 'M');
        Animal animal1=dog1; //done implicitly,
        Animal animal2=cat1;// converting sub type to super type, implicitly
        System.out.println("==========================");

        int x= 100;
        byte y=(byte)x;

        Animal animal3=cat3;// converting sub type to super type, implicitly
        Cat cat2=(Cat)animal3;

        //Cat cat4=(Cat) animal1;// bu casting olmaz casting throw wrror verir

        //baska ornek
        Iphone phone1=new Iphone("I2","6", 1000);
        Phone phone2=phone1;// upcasting implicitly happens


        Phone phone3=new Samsung("S20", "9", 1100);
        Samsung phone4=(Samsung)phone3; //down casting ve manually should be done

        //Iphone phone5=phone3;// error veriyor


    //    Iphone phone5=(Iphone) phone3;// error yok ama throw eror verecek
        /*
        Exception in thread "main" java.lang.ClassCastException: class day57_Polymorphism.PhoneTask.Samsung cannot be cast to class day57_Polymorphism.PhoneTask.Iphone (day57_Polymorphism.PhoneTask.Samsung and day57_Polymorphism.PhoneTask.Iphone are in unnamed module of loader 'app')
	at day58_Polymorphism.TypeCasting.main(TypeCasting.java:37)

         */
        //Iphone phone5=phone3;// error veriyor


    }
}
