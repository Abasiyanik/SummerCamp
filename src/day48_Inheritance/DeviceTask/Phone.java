package day48_Inheritance.DeviceTask;

public class Phone extends Device{
    /*
      3. create a sub class of device called phone:
                    attributes: brand, model, price, MadeIn, screenSize, hasBattery, hasMemory, hasSimCard, OS
                    methods: call, text, setInfo, toString
                    add a constructor that can set the fileds
     */
    static boolean hasSimCard=true;
    public String OS;

    public void call  (long phoneNumber){
        System.out.println("Calling :" +phoneNumber);
    }
    public void text (long phoneNumber){
        System.out.println("Texting to :" +phoneNumber);
    }


    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize,String OS) {
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        //this.hasSimCard = hasRemoteControl;
        this.OS=OS;

    }



}
