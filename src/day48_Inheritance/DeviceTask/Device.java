package day48_Inheritance.DeviceTask;

public class Device {
    /*
    Device Task:
        1. create a class called Device
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize,
                    methods: setInfo, toString

     */
    public String brand;
    public String model;
    public double price;
    public boolean hasBattery;
    public boolean hasMemory;
    public String screenSize;


    public static String madeIn;
    public static boolean isElectronic;
    static {
        madeIn="China";
        isElectronic=true;}

    public void setInfo(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hasBattery = hasBattery;
        this.hasMemory = hasMemory;
        this.screenSize = screenSize;
    }
    public String toString (){
        return "================================"+
                "\nBrand: "+brand+
                "\nModel: "+model+
                "\nMade in: "+madeIn+
                "\nScreen Size: "+screenSize+
                "\nPrice: "+price+
                "\nDoes it have battery? "+hasBattery+
                "\nDoes it have memory? "+hasMemory+
                "\n================================";
    }

}
/*
 2

        4. create a sub class of Device called Laptop:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, hasCPU, hasMouse, hasKeyBoard, OS
                    methods: coding, watching, setInfo, toString
                    add a constructor that can set the fileds
 */
