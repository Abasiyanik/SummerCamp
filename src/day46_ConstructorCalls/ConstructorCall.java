package day46_ConstructorCalls;

import java.lang.reflect.Constructor;

public class ConstructorCall {

    public ConstructorCall(){
        method1();
        method2();
        //constructor digerlerini cagirir ama kendisi digerlerince cagrilamaz

    }
    public static void method1() {
        System.out.println("a");
    method2();
        //ConstructorCall();
    }
    public static void method2() {
        System.out.println("b");
    method1();
    }
    public void method3(){
        //ConstructorCall();
    }
    public static void main(String[] args) {
        ConstructorCall.method1();
    }
}
