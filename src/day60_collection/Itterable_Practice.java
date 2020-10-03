package day60_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Itterable_Practice {

    public static void main(String[] args) {

        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10, 1, 1, 2, 2, 3, 3, 4, 4));
//        task to remove numbers <5

        for (int i=0; i<list1.size(); i++){
            if (list1.get(i) <5){
                list1.remove(i);
            }
        }

        System.out.println("list1 = " + list1);// list1 = [2, 4, 5, 6, 7, 8, 9, 10] olmadi zira herdefasinda index number la beraber sira degisir

        System.out.println("===================================================================");

        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10, 1, 1, 2, 2, 3, 3, 4, 4));
//        task to remove numbers <5
// by using foreach
        /*for (Integer each: list2){
            if (each <5){
                list2.remove(each);
            }
        }*/

        System.out.println("list2 = " + list2);// ConcurrentModificationException verdi
       // for each loop exception verdi ve failed

        System.out.println("===================================================================");

        ArrayList<Integer>list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10, 1, 1, 2, 2, 3, 3, 4, 4));
        list3.removeIf(p->p<5);
        System.out.println("list3 = " + list3);//list3 = [5, 6, 7, 8, 9, 10]
        //removeIf internally used the iterator dolayisiyla hata olmadan oldu.

        System.out.println("======PEKI MANUALLY ITERATION NASIL OLUR =====================");

        ArrayList<Integer>list4=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10, 1, 1, 2, 2, 3, 3, 4, 4));

        //ITERATOR INTERFACE SHOUL BE APLLIED TO THIS ARRAYLIST HOW?????????????

        Iterator<Integer> it= list4.iterator();// iterator will iterata all objects and saved in it as Iterator

        // ONCE EMIN OLMALIYIZ KI EMPTY OLMAMAMLI
        //hasNext:check if there are enough eleemnt left to be iterateed, return boolean
        //next(): eger hasNext true ise next method ile objecte ulasim olur
        //if hasNext is ture, it acces to the objects otherwise no objects can be accesed
        while (it.hasNext()){// en son elemana kadara hasNext tumune cek eder.
            if (it.next()<5){
                it.remove();
            }

        }
        System.out.println("list4 = " + list4);

        System.out.println("===========================================================");

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,2,3,3,4));
        for(Iterator<Integer> i = list5.iterator();  i.hasNext();   ){
            if(i.next() < 5 ){
                i.remove();
            }
        }

        System.out.println(list5);




    }
}
