package day46_ConstructorCalls;

public class Car {
    String brand;
    String model;
    String color;
    int year;
    double price;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, String color) {
        this(brand, model);
        this.color = color;
    }

    public Car(String brand, String model, String color, int year) {
        this(brand, model, color);
        this.year = year;
    }

    public Car(String brand, String model, String color, int year, double price) {
        this(brand, model, color, year);
        this.price = price;
    }

    public String toString(){
        return "Brand: "+ brand + "\nModel: "+ model+"\nColor: "+color + "\nYear: "+year+"\nPrice: $"+price;
    }
}
