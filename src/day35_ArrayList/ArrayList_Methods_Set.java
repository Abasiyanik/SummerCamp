package day35_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_Methods_Set {
    public static void main(String[] args) {
        ArrayList<String> students=new ArrayList<>();
        students.add("Ali");
        students.add("Veli");
        students.add("Selami");
        students.add("Cemile");
        students.add("Sama");

        students.add(2, "Kaan");//Kaani ekler ama Selamiyi 3 e oteler yani Selami hala kalir
        // Sama ile Ibrahim replace edlim
        students.set(5, "Ibrahim");
        students.set(0, "Ulan");


        System.out.println(students);





        //ARRAYLIST METHOD: REMOVE
        //Remove add in tersi birseyi siler

        //remove index: remove by index
        System.out.println("=======================");
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);// 1 3 5 6 7
        list.remove(3);// 6 yi aldik
        System.out.println(list);// 1 3 5 7

        //remove Element sadece elemani yok eder
        System.out.println(students);//[Ulan, Veli, Kaan, Selami, Cemile, Ibrahim]
        students.remove("Veli");//[Ulan, Kaan, Selami, Cemile, Ibrahim]

        System.out.println(students);
        students.clear();// herseyi siler
        System.out.println(students+"cleared");

        int a=1;
        list.remove(a);
        System.out.println(list);//[1, 5, 7] 3 gitti

        System.out.println("================");

        ArrayList<String> student2=new ArrayList<>();
        student2.add("yoyo");
        student2.add("soso");
        student2.add("momo");
        student2.add("coco");
        student2.add("toto");

        boolean sg= student2.remove("soso");//yoyo, momo, coco, toto

        System.out.println(student2);

        System.out.println(sg);
        boolean cg= student2.remove("Momo");// M buyuk remove olmaz //false
        System.out.println(student2);
        System.out.println(cg);


    }
}
