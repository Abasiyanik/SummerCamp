package day43_static;

import day42_Static.Tester;

public class StaticBlock2 {
    // bunlari main icinde koymuyoruz zira bu static ler main disinda heryerde kullanilabilir
    static int a;
    static String b;
    static Tester tester1;
    static Tester tester2;

    // the only perpose to intilicae static variables
    // all the items in block is static.
    // especially if it takes more than one
    static {// why i need static block :
        // in the future you will have a veaible and initilizer take one step

        a=100;
        b="Cybertek";
        tester1=new Tester();
        tester1.setInfo("fat", 'M', 2324, "SDET", 155555);
        tester2=new Tester();
        tester2.setInfo("hat", 'F', 34343, "QA", 123000);

    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
