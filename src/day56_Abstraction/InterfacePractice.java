package day56_Abstraction;

public interface InterfacePractice {
    int a=10; // bu final static olur burada default olara ve
    public static final int b=300;

    static void method1(){
        System.out.println(a+" and "+b);
    }

    public static void main(String[] args) {
        method1();
    }
    public default void method2(){

    }

    //public void method3(){} // instance metods olmaz

    // public InterfacePRactice(){}// contrstructor olmaz

    public abstract void method4();// abstract method sinirsiz sayida olur
    void method();// abstract methodda abstract keyword kullanmaya gerek yok

    //static {}// static block olmaz

}
