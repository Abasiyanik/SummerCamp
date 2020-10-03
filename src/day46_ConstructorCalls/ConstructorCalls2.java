package day46_ConstructorCalls;

public class ConstructorCalls2 {
    public ConstructorCalls2(){
        System.out.println("A");
    }

    public ConstructorCalls2(int a){
        //ConstructorCalls2(); // constructor baska bir constructorda acilmaz.
        // ama this keyword ile acilabilir
        this(); //bu sayede bir onceki constructor ile cagrilmaz cagrilmasi icin this() kullanilari
        // this()= menas Constrcutor2()
        System.out.println("B");
        //System.out.println("========");
    }
    public ConstructorCalls2(String str){
        this(3);
        System.out.println("C");

    }

    public ConstructorCalls2(char a){
        this();// HER ZAMAN ILK LINE DA OLMALI IKINCI LINE DA OLURSA COMPILE ERROR VERIR
        System.out.println("D");
        //this();// compile error verecektir

    }

    public static void main(String[] args) {
    //    new ConstructorCalls2();// sadece birinci consructor cagrilir
    //    new ConstructorCalls2(2);// ikinci cagrilir o birinciyi de cagirir sonuc A B
   //     new ConstructorCalls2("aha");// bu 3yu cagirir o ikinciyi o da birinciyi cagirir ve sonuc :ABC
        new ConstructorCalls2('A'); // once birinciyi sonra D: AD
    }
}
