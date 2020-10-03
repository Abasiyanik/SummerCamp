package day59_OOPReview;

class A{
    private int a=100;
    int b=200;
    protected int c=300;
    public int d=400;
//only visible ones inherited to intheritnace class
    private void method1(){}
    void method2(){}
    protected void method3(){
        System.out.println("helllo coci");
    }
    public void method4(){
        System.out.println("hello anam");
    }

}



public class Inheritance extends A{
    public void method3(){
        System.out.println("hello kanki");// override ederken ya kendisi veya daha accesiable bir yapi olmali
    }
    public void method4(){
        System.out.println("hello babam");
    }
    public static void main(String[] args) {
        Inheritance obj=new Inheritance();
        //System.out.println(obj.a);//privare connot be inherited
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
        //obj.method1();//not inhereted
        obj.method2();
        obj.method3();
        obj.method4();


    }



}
