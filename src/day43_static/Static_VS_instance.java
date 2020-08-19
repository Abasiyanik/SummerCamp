package day43_static;

//import day42_Static.StaticMethods;

public class Static_VS_instance {

    static int staticVariable;//1 static copy
    int instanceVariable;// 2 copies

    public static void main(String[] args) {
        //two objects olacak ve sadece bir static ama iki
        Static_VS_instance obj1=new Static_VS_instance();
        Static_VS_instance obj2=new Static_VS_instance();
       //
       obj1.instanceVariable=100;
       obj2.instanceVariable=200;
       staticVariable=300;
        System.out.println(obj1.instanceVariable+"  "+obj2.instanceVariable+"  "+obj1.staticVariable);
        obj2.staticVariable=800;// static degisecektir,
        System.out.println(obj1.instanceVariable+"  "+obj2.instanceVariable+"  "+obj1.staticVariable);

        //static variable hem object name ve hemde class name ile cagirabliriaz
        // ama class name ile cagirmak daha tavsiye edilir. asagid goruldugu gibi

        System.out.println(Static_VS_instance.staticVariable);

    }



}
