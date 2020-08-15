package day41_Static;

public class printingCustomClassObjects {
    public static void main(String[] args) {
 //before the custom class
 //toString method use to print object or object name
//before the class we learned util ,String classes

        String str=new String("Cybertek"); //str object name ama cybertek object
        System.out.print(str);
        System.out.println(new String (" School"));

        System.out.println(str.toString());
        System.out.println(new String (" School").toString());
        //object are coming from class
        //toString method eger object ve object name print edilecekse cagrilmalidir
        // complier otomatik cagirir
        //String class da toString otomatik cagirlir biz gormeyiz mesela yukarda oldugu gibi
    //implicintley called by compiler

        // if return method ise toString kullanilir
        // void ise bu kullanilmaz.

        //toString method is a instance method so it does not need specifier.



    }
}
