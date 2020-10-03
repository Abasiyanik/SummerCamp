package day57_Polymorphism.PhoneTask;

//import jdk.swing.interop.SwingInterOpUtils;

public class Samsung extends Phone implements  AndroiadApp{
    public Samsung(String model, String size, double price) {
        super("Samsung", model, size, price);
        if (price>1500){
            throw new RuntimeException("too expensive and cannot be greater than 1.5K");
        }
    }

    @Override
    public void download() {
        System.out.println("Samsung downloads app from" +AppStoreName);

    }
    public void freezing(){
        System.out.println("samsung is freezing");
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("texting to "+ phoneNumber);

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("calling to "+phoneNumber);

    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                "} " + super.toString();
    }
}
