package day51_Exceptions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ExceptionalHandling {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();//empty
       // list.add(2);
     //   System.out.println(list.get(1));// bu runtime unexcepted exception
        //bundan sonrasi yazilmaz ve sistem kalir
        //burda try& catch block kullanilablir

        String exceptionMessage="";
        try {
            System.out.println(list.get(0));
        } catch (IndexOutOfBoundsException e){
            exceptionMessage=e.getMessage();
        }

        System.out.println("next step");
        System.out.println(exceptionMessage);
    }

}
