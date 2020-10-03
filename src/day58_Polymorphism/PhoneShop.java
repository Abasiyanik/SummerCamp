package day58_Polymorphism;

import day57_Polymorphism.PhoneTask.*;
import day57_Polymorphism.PhoneTask.Huawei;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

/*
ask01:
   Create a class called PhoneShop
    Copy the following array of Phone:
            Phone[] phone = {
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Samsung("S20", "7", 1100),
                            new Samsung("S20", "7", 1100),
                            new Samsung("S20", "7", 1100)
                            };
            (Phone is imported from day57 package)
        create an arrayList called phoneShop and store all phone objects from array of phone
        write a program that can count the total number of Iphone, Samsung and Huawei from the list

 */
public class PhoneShop {
    public static void main(String[] args) {


    Phone[] phone = {
            new Iphone("12", "6.1", 1000),
            new Samsung("S20", "7", 1100),
            new Iphone("12", "6.1", 1000),
            new Samsung("S20", "7", 1100),
            new Iphone("12", "6.1", 1000),
            new Samsung("S20", "7", 1100),
            new Iphone("12", "6.1", 1000),
            new Samsung("S20", "7", 1100),
            new Iphone("12", "6.1", 1000),
            new Samsung("S20", "7", 1100),
            new Iphone("12", "6.1", 1000),
            new Samsung("S20", "7", 1100),
            new Samsung("S20", "7", 1100),
            new Samsung("S20", "7", 1100),
            new Samsung("S20", "7", 1100)
    };
        ArrayList<Phone>phoneShop=new ArrayList<>(Arrays.asList(phone));
        //System.out.print(phoneShop);
        int countIphone=0;
        int countSamsung=0;
        int countHuaWei=0;
/*
        for (int i=0; i<=phoneShop.size()-1; i++){
            if (phoneShop.get(i) instanceof Iphone){
                countIphone++;
                continue;
            } else if(phoneShop.get(i) instanceof Samsung){
                countSamsung++;
                continue;}
            else {
                countHuaWei++;
            }

            }


 */

 /*
        for(int i = 0; i <= phoneShop.size()-1; i++){
            Phone each = phoneShop.get(i);  // get each objects from array

            if( each instanceof Iphone  ){ // checks if the objects is Iphone
                countIphone++;
            }else if(each instanceof Samsung){ // checks if the object is samsung
                countSamSung++;
            }else {
                countHuaWei++;
            }

        }
        */


        for (Phone each:phoneShop)//bir statement oldugu icin coruly bracket gerek yok
            if (each instanceof Iphone)
                countIphone++;
              //  continue;
            else if(each instanceof Samsung)
                countSamsung++;
             //   continue;}
            else countHuaWei++;






        System.out.println(" Total number of Samsung "+countSamsung);
        System.out.println(" Total number of Iphone "+countIphone);
        System.out.println(" Total number of HuaWei "+countHuaWei);
        }







}
