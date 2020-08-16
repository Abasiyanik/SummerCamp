package day41_Static;

import org.w3c.dom.ls.LSOutput;

public class Multi_Class {
    //there is only one public class ve adi file name ile ayni olmalidir.
    // buradaki ornekte class public ve adi Multi_Class ile file name ayni
    public static void main(String[] args) {
        System.out.println("Class 1");
    }

}

//ikinci class olusulur ve .java olusur


class test1{//it is default access modifier dir

    public static void main(String[] args) {
        System.out.println("Class2");
    }


}
//ikinci bir class daha olusturuldu
// public name ile file name ayni olmalidir.
class test2{
    public static void main(String[] args) {
        System.out.println("Class3");
    }


}
//her class icine girip RUN  ettigimide ilgili class run edilir
