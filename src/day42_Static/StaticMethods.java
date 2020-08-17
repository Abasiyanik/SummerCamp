package day42_Static;

public class StaticMethods {
    int a=200;
    static int b=400;

    public static void main(String[] args) {
        System.out.println(b);// b burada yazilir cunku static ve heryer de kullanilir
        //System.out.println(a);// instances static methodlarda kullanilamaz. mutlaka cagrilmasi gerekir
        //System.out.println(this.a);//this de burada kullanilamaz
        //object olusturulmadan instance variable static methodda kullanilamaz
        // ve instance variable bir instance methodda kullanilmadikca static methodda kullanilmaz

        StaticMethods obj=new StaticMethods();
        System.out.println(obj.a);
        // the only var to call the instances
        StaticMethods eth=new StaticMethods();
        System.out.println(eth.a);
    }
}
