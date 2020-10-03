package day48_Inheritance.DeviceTask;

public class Laptop extends Device {
    /*
    4. create a sub class of Device called Laptop:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, hasCPU, hasMouse, hasKeyBoard, OS
                    methods: coding, watching, setInfo, toString
                    add a constructor that can set the fileds
     */

    static boolean hasCPU=true;
    static boolean hasMouse=true;
    static boolean hasKeyBoard=true;
    public String OS;





    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize,String OS) {
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.OS=OS;

    }

    public void coding (String language){
        System.out.println("coding " +language+ " in "+ brand+" "+ model);
    }
    public void watching (){
        System.out.println("Watching by" +brand);
    }


}
