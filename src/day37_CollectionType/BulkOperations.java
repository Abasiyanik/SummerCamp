package day37_CollectionType;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list. add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        boolean r1= list.contains(1);// true
        ArrayList<Integer> element=new ArrayList<>();
        element.add(1);
        element.add(2);
        element.add(3);

        boolean r2=list.containsAll(element);// collection type girilmeli o da ArrayList olamli
        // elemetlarin icindeki hepsini kontrol eder varsa true yoksa false olur

        System.out.println(r1+""+r2);
        ArrayList<Integer> element2=new ArrayList<>();
        element2.add(1);
        element2.add(2);
        element2.add(5);
        System.out.println(list.containsAll(element2));// collection type girilmeli o da ArrayList olamli

        System.out.println("=====================================");
        //Java class package called utility icindeik array asList custom method kullanilarak istler daha kolay olur

       boolean r3= list.containsAll(Arrays.asList(1,2,4));//  artik yeni bir arraylist yapmaya kaldmadi zira arrays.as list verileri collectionType yapar

        System.out.println(r3);
        //diger bir yol mesela bir WC array olsun
        Integer [] arr={10,20, 40};// Weapping class array
        boolean r4=list.contains(Arrays.asList(arr));
        System.out.println(r4);

    }

}
