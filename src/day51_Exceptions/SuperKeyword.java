package day51_Exceptions;
class Test {
    int a;

    public void method(){
        System.out.println("hello");
    }

    public void m(){
        this.method();
        // super.method();// test class does not have super class. iti si a super class itself.
        System.out.println("gidi gidi");
    }

}
public class SuperKeyword extends Test{
/*
    public SuperKeyword (int a){
        super.a=a;
    }

 */
    public void print1(){
        System.out.println(a);

    }
    public void print2(){
        System.out.println(super.a);

    }

    public void method2(){
        super.method();// super ile
        System.out.println("hi");
    }
    public void method3(){
        this.method2();
        super.method();
        System.out.println("naber");
    }

    public static void main(String[] args) {
        Test test1=new Test();
        SuperKeyword sp1=new SuperKeyword();
        sp1.a=200;
        test1.a=300;
     //   sp1.print1();
      //  sp1.print2();
      //  sp1.method2();
        sp1.method3();
        sp1.m();
    }

}
