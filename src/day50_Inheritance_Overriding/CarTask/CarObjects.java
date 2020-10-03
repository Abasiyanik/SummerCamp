package day50_Inheritance_Overriding.CarTask;

public class CarObjects {
    public static void main(String[] args) {

        Honda honda1=new Honda();
        Mercedes merco1=new Mercedes();
        Tesla tesla1=new Tesla();
        Jeep jeep1=new Jeep();
        // hepsi sub classtan gelir
        tesla1.start();
        System.out.println("==================");
        merco1.start();
        System.out.println("==================");
        honda1.start();
        System.out.println("==================");
        jeep1.start();
        System.out.println("=================");


    }
}
