package day43_static;

public class StaticBlock3 {
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;
    static {
        d=1;
        e=2;
        f=3;
    }
//tum bu degerleri main icinde initilize edersek bunlari diger classlarda kullanamayiz
    //test e bak

    public static void main(String[] args) {
        a=100;
        b=200;
        c=300;

    }



}
