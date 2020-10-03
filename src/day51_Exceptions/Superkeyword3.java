package day51_Exceptions;

class C{

    public C(int a){// bu constractor default constractor degil
        //bu constractor is a constracutr with int argument
        System.out.println("super class int arg constructor");
    }

}

public class Superkeyword3 extends C {// subclass has to call a constructor from super class

    public Superkeyword3(int a){

        super(100);// superclass constructor default olmadigi icin argumant oldugu icin buraya ibr argument koymak gerkmektedir. bu super constructor cagiri ve calistiriir.

        System.out.println("sub class constructor with int arg");


    }

    public static void main(String[] args) {
        Superkeyword3 spk1=new Superkeyword3(3);// compile oldugunda hem superclass constructor cagrilir ve hem de digeri
        // default ise cagirmaya gerek yok

    }
   /*
    public void method(){
        super(a:300:)
    }

    */

}
