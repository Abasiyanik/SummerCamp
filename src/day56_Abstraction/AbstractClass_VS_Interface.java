package day56_Abstraction;

public abstract class AbstractClass_VS_Interface {
        int a; // burda ise instance
    //    static int b;
        protected static int b;
        public void method1(){
            System.out.println("hoh");
        }
        public static  void method2(){
            System.out.println("lolo");
        }

    public AbstractClass_VS_Interface(int a) {//constructor
        this.a = a;
    }

    public abstract  void method3();
        static {b=300;}
    {}// instance block
}


interface A {
    int a = 10;// public static final
    static void method4(){
        System.out.println("yoyo");
    }
    abstract void method3();//piblci as default
    int method3_2(int b);// public
default void method5 (){}// public
    public static void main(String[] args) {
        System.out.println(a);
        AbstractClass_VS_Interface.method2();

       method4();
    }

    }