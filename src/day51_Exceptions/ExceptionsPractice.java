package day51_Exceptions;
import Library.Util;


public class ExceptionsPractice {
    public static void main(String[] args) {
        System.out.println("hello");
        try{
        Thread.sleep(1000);
        } catch(InterruptedException e) {

        }


        System.out.println("World!..");

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e) {

        }


        System.out.println("How are you?");
        sleep(2);// we can handlle the exception in am thod won called sleep

        System.out.println("yow");
        //we put it in librart
        Util.sleep(1);
        System.out.println("yoodw");


    }

public static void sleep(int seconds){// sleep it by using this method.
    try{
        Thread.sleep(seconds*1000);
    } catch(InterruptedException e) {

    }
}
}


