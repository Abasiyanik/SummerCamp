package day42_Static;
class Test{
    int a; //this is a instance variable // static variable to be given ander STATIC keywords
    static int b;

}
public class StaticVariable {
    public static void main(String[] args) {
        Test obj1=new Test();
        obj1.a=5;//instance variable ve sadece object1 e ait diger inde farkli
        obj1.b=20;//static variable ve iki objecttede var.

        Test obj2=new Test();
        obj2.a=10;
        //obj2.b=25;

        System.out.println(obj1.a);//object 1 is
        System.out.println(obj2.a);
        System.out.println(obj1.b);
        System.out.println(obj2.b);

    }


}
