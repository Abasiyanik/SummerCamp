package day37_CollectionType;

//import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation_Practice {
    public static void main(String[] args) {
        ArrayList<String> students=new ArrayList<>();
        students.add("Sayem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("ehary");

        boolean r1=students.containsAll(Arrays.asList("Ulku", "Fatih"));
        System.out.println(r1);

        System.out.println("=======================");
        ArrayList<String> group1 =new ArrayList<>();
        //add all students names in your group
        group1.addAll(Arrays.asList("Muhtar", "Nadir", "Saim"));
        //verify your mentor and one of your cloest friend's name contained in the list.
        boolean r4= group1.containsAll(Arrays.asList("Kuzzat", "Osman"));
        System.out.println(r4);

        System.out.println("=============================");

        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,2,2,3,2,3,2,1,2,3));

        //remove all 1,2, 3,
        //remove sadece 1 veya 2 3 u bir kere remove eder
        //bu nedenle removeAll metod kullanilir
        list1.removeAll(Arrays.asList(1,2,3));
        System.out.println(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,2,2,3,2,3,2,1,2,3));
        //VEYA
        list2.retainAll(Arrays.asList(4,5,6,7));
        System.out.println(list2);

        System.out.println("=========================================");
        ArrayList<String> employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed", "Ahmed", "Ahmed", "Virginia", "Beslan", "Ibrahim", "Muhtar"));
        System.out.println(employees);
        employees.removeAll(Arrays.asList("Ahmed"));

        System.out.println(employees);// tum Ahmedler gitti
        //remove everybody except Ahmed
        ArrayList<String> employees1=new ArrayList<>();
        employees1.addAll(Arrays.asList("Ahmed", "Ahmed", "Ahmed", "Virginia", "Beslan", "Ibrahim", "Muhtar"));
        employees1.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employees1);//Ahmed disinda herkes gider



    }

}
