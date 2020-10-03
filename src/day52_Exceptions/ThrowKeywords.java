package day52_Exceptions;

public class ThrowKeywords {
    public static void main(String[] args) {// throws Exception buraya konacaktir
        //method1(); // hala compile error verir

        System.out.println("================");

        method2();// compile error yok zira cozuldu
        System.out.println("================");
        //method3();
        System.out.println("================");
    }

    public static void method1() throws InterruptedException{// throw cozum yok ama idare eder
        Thread.sleep(3000); // to get rid of this error
            //1. use try and catch
        //2. or use throws keyword
         }

    public static void method2() {
        try {// trytamamen olayi cozer ve exception birer
            Thread.sleep(3000);
        } catch(InterruptedException e) {}

        // to get rid of this error
        //1. use try and catch
        //2. or use throws keyword
    }

    public static void method3() throws Exception{
        try {// trytamamen olayi cozer ve exception birer
            Thread.sleep(3000);
        } catch(InterruptedException e) {}

        // to get rid of this error
        //1. use try and catch
        //2. or use throws keyword
    }
}
