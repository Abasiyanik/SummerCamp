package day44_Constructor;

import java.lang.reflect.Constructor;

public class ConstructorIntro {
    /*
    constructor ayrica bir METHOD
    METHOD normade soyledir
    Access-Modifier Specifier ReturnType methodName(Parameters){
    statements}

    Constructor :very special method, used when we create the object of the class

    every class MUST have a constructor. if we do not create one, complier createsit for us.


        A       obj     =   new         A();
    class name  obj name    keyword     Constructor

    eger herhabfif bir consructor verilmesse compiler kendi olusturur wtohut ant argument ve biz buna bagli object olusturabliirz

    declare:
    Access-modifier The same name of class in main (argument){statement}

     */
    //public ConstructorIntro(int a){  }
    public ConstructorIntro(String arr){
        System.out.println("Hello "+arr);
    }
    public static void main(String[] args) {
        //ConstructorIntro obj =new ConstructorIntro();// bu bir constrcutordar ve ayrica bir method dur
        //eger method sa certain type declaration lari vardir
        // regular method givbi
        //ConstructorIntro obj =new ConstructorIntro(10);// burda artik bizim
        //contstractor with argument var o da 10
        /*

    eger biz burda oldugu gibi bir tane constructor yaparsak artik complier kendsii
    bir consructor yapmaz ve bize tabi olur

   eger constructor argument varsa artik onsuz object olurturulmaz

   mesela construcotr string ile ise object de string icermesi gerekmektedir.


         */

        ConstructorIntro obj=new  ConstructorIntro("MFA");// Hello MFA yazilacaktir
        //
        /*
        creat object from class
        Classname onj=new WxistingConstructor

         */
        ConstructorIntro obj1=new  ConstructorIntro("yavuz");
        ConstructorIntro obj2=new  ConstructorIntro("ahmed");

    }
}
