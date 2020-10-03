package day58_Polymorphism;


import day57_Polymorphism.PhoneTask.*;
import day57_Polymorphism.PhoneTask.Phone;

public class DownCasting_Practice {
    public static void main(String[] args) {
        Phone phone1=new Iphone("11", "6", 1000);
        Iphone iphone =(Iphone) phone1;
        System.out.println(phone1);
        System.out.println(iphone);

        iphone.faceTime(2342323);
        ((Iphone) phone1).faceTime(435534);//downcasting yapmak gerekiyor
        System.out.println("==============");

        Phone phone2 =new Samsung ("S20", "7", 1430);
        ((Samsung)phone2).freezing();
       // ((Iphone)phone2).faceTime(343534);// samsung ile iphone has a realtion oldugu icin exception verecektir.
        Phone phone3=new Huawei("huha", "6",200);
        ((Huawei) phone3).stealInfo();// downcasting is done
        


    }
}
