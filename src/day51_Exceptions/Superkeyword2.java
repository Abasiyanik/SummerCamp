package day51_Exceptions;


class B{

    public B(){
        System.out.println("supercalls's default constructor");
    }

}

public class Superkeyword2 extends B {

    public Superkeyword2 (){
        //super();// this call the super calss constrcutor // public constructor da devamli ilk parent cagrilir ve sonra digeri cagrilir.
        // eger superclass default degil ise o zaman cagrilmasi lazim. yoksa cagrilmasina gerek yok.
        System.out.println("sub class's default constructor");
    }

 // eger subclass constrcutor verilmezde sadece birinci yazilacakti ama smdi ikiside yazilir


    public static void main(String[] args) {

        new Superkeyword2();// two constrcutor will be called it is mantadory
    }

    }
