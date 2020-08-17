package day42_Static;

public class Car {
    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;
    static boolean hasWheel = true; //buda atatic olur
    static int numberOfTires = 4;//tum arabalarda 4 tekerlek var bu static olarak atandi.
    static boolean hasEngine = true;
    static boolean hasDoors = true;
    static boolean hasAirbag = true;
    static boolean hasSeatBelt = true;
    static boolean hasHorn = true;

    public void start() {
        System.out.println("Statring " + brand + " " + model);
    }

    public static void printTires() {// herhangi bir instance number kullanilmadigi icin instance method kullanilmaya geek yok

        System.out.println("Number of tires is :" + numberOfTires);
    }

    public String toString() {
    return "Brand :"+brand+"\nModel :"+ model+"\nYear :"+year+"\nColor: "+color
            +"\nNumber of tires: "+numberOfTires+"\nHas Engine: "+hasEngine
            +"\nHas Wheel: "+hasWheel+"\nHas Airbags: "+hasAirbag;
    }



    /*
    car1:
    car2:
    car3:
    car4:
     */



}
