package day34;

import java.util.ArrayList;// ArrayList bu klass ta kullanilablilir

public class List_Intro {
    public static void main(String[] args) {

        //how to declare the array list
        // ArrayList <DataType>name= new ArrayList <DataType> ();
        ArrayList <Integer> score=new ArrayList <Integer>();
        score.add(95); //55 is accepted as defaul int and it is converted to Integer
        //means nonprimitive to primitive called boxing specifically AUTOBOXING
        score.add(100);// HER DEFASINDA bir sonraki indexe eklenir mesela bu birinci indekse eklendi
        score.add(85);//index 2
        score.add(1, 300);//boyle yapinca 300 diferlerini iteler ve index numberlarini degistittiriri.
        // 95, 300, 1000, 85 olur
        score.add(4,44);
        //score.add(7, 67);
        // compile errrr veriri zira bizde 4 element var ve son index number 4 amam
        // biz 7 inciye eklemek istiyoruz ki bu imkansiz.



        System.out.println(score);

        int b=score.get(4); //Integer olarak alinir ama int e donusturulur. nonprim to prim  boxing

        System.out.println(b);




    }
}
