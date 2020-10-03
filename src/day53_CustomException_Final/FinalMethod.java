package day53_CustomException_Final;

class A{

    public final void method1(){// final olunca override olmaz ve method override olmaz
        System.out.println("hoho");
    }
    private final void method1(int a){}

    public final static void method1(boolean a){}




}


public class FinalMethod extends A {

//    public void method1() { System.out.println("bobo");}// bu metod digeri FINAL oldugu icin override olmaz.
final public void method1(String a) { System.out.println("bobo"+a);}// artik overloaded oldu ve final olabilir


}



