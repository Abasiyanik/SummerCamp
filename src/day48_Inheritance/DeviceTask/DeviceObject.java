package day48_Inheritance.DeviceTask;

public class DeviceObject {

    public static void main(String[] args) {
        Laptop obj1=new Laptop("Dell", "XPS", 1200, true, true, "14", "Windows");

        System.out.println(obj1);

        obj1.watching();
        obj1.coding("Java");

       
    }
}
