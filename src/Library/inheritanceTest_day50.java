package Library;

import day50_Inheritance_Overriding.AccessModifiers;

public class inheritanceTest_day50 extends AccessModifiers {
    // bu class day50ddeki AccessModifier icin olusturulmustur
    // AcessModifiers from dy50 ye inheritance oldu
    public static void main(String[] args) {


        System.out.println(publicData);
        System.out.println(protectedData);// interitanceTest-day50 AccessModifiers in child oldugu icinprotectedData accesible
        System.out.println(inheritanceTest_day50.protectedData);
        System.out.println(inheritanceTest_day50.publicData);


      //  System.out.println(defaultData);// default da baska bir package de oldugu icin ne yazikki gorunmuyor
    //System.out.println(privateData);/

    }}
