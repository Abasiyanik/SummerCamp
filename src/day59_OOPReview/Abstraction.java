package day59_OOPReview;


interface X{

    int a=10;// bu class olmadigi icin bunlar statiktir ve public only AM dir //public static final ve degismez
    static int b=20;

    public abstract void method1();
    void method2();
}
abstract class Y{

    int a;
    static int b;
    public abstract void method2();

}
public class Abstraction {

    public static void main(String[] args) {

    }
}
