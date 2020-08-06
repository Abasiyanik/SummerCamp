package day38_JavaRecap;

//import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Character> chars=new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','O','P','D','A','C','B'));
        System.out.println(chars);

        // sort methodu ile sort edilir
        Collections.sort(chars);
        System.out.println(chars);

        System.out.println("=======================");

        ArrayList<String > students=new ArrayList<>();
        students.addAll(Arrays.asList("Aslan", "Cristina", "Zeliha", "Imam", "Fatima", "Mohammad"));
        System.out.println(students);//0            1           2       3       4           5
        //[Aslan, Cristina, Zeliha, Imam, Fatima, Mohammad]
        //SWAP ILE yer degistirdirir

        Collections.swap(students,1, 4 ); //burda once collection type gerekir o da students
        System.out.println(students);//[Aslan, Fatima, Zeliha, Imam, Cristina, Mohammad]

        Collections.swap(students,1, 4 ); //burda once collection type gerekir o da students
        System.out.println(students);//Aslan, Cristina, Zeliha, Imam, Fatima, Mohammad] eski haline gelir

        System.out.println("===================");
        //frequency kullanilacak
        ArrayList<String > items=new ArrayList<>();
        items.addAll(Arrays.asList("Coffe", "Coffe", "Tea", "Tea", "Tea","Pepsi", "Battery", "Battery", "Egg"));
        int count=Collections.frequency(items, "Tea");
        System.out.println(count);
        ArrayList<String> unique=new ArrayList<>();

        //unique bul bakalim
        for (String each:items){
            count=Collections.frequency(items,each);
            if (count==1)
            {
                System.out.println(each);
                unique.add(each);
            }
        }
        System.out.println(unique);

        //diger yontem
        ArrayList<String>unique2=new ArrayList<>();
        unique2.addAll(items);
        //***********************************************************************************
        //burada eger elemanin frequency si birden buyukse onu yok et diyerek isi hallederiz
        //************************************************************************************

        unique2.removeIf(p-> Collections.frequency(unique2, p)>1);
        System.out.println(unique2);

        System.out.println("=============================================");
        //max and min
        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(10, 9 , 10, 1000, 4543, -4, 45 ,56, 1000, 87,4346, -1));
        Integer max= Collections.max(list);
        Integer min= Collections.min(list);
        System.out.println(max+" "+min);

        System.out.println("===========================================");

        //replace all method

        Collections.replaceAll(list, 1000, 100000);
        System.out.println(list);//10, 9, 10, 100000, 4543, -4, 45, 56, 100000, 87, 4346, -1]







    }
}
