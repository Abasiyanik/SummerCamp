package day43_static;

public class Variables {
    int d;
    static int s; //bu instance method classa aittir.
    // buradaki static method heryerde kabul edilir dolayisiyla GLOBAL VARIABLE denir

    // local variables are usble in if blocks or in methods and they are only accesiable in block and methods
    /*
    local variable is declared in metod or a block
    initializng is nesseary int a; yazilirsa saedece kullanilmaz.

    static method accept only static but not instance

     */
    //instance variable shared by object
    // but local by method

    public static void method(){
        //StaticBlock2
        //System.out.println(d);
        System.out.println(s);// bu bir gloabal variable dir
        // System.out.println(a);// this variable can be used because it
        // was given in another one .
    //int de yi yazdirmak icin objectte atamak lazim soyleki
    Variables obj=new Variables();
        System.out.println(obj.d);// buradaki d sadece object oldugu icin
    }
    /* instance variable sadece icinde declare edilir.
     */
    public static void method1(){
        int a;
        if (2>1){
         //   int a=20;// hata verir
            int b=30;
        }
        //System.out.println(b);
       // System.out.println(a);;


    }
}
