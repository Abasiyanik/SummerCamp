package day60_collection;

import java.util.*;

public class SetPractice {
// write aprogram that can remove duplicates from string

    public static void main(String[] args) {
        String str = "ddddddddcccccccbbbbbbbbaaaaaaaaa"; // dcba

        String[] arr = str.split("");

        System.out.println(Arrays.toString(arr)  ); //

        //

        Set<String> s1 = new LinkedHashSet<>();
        s1.addAll( Arrays.asList(arr) );

        System.out.println(s1);

        System.out.println("=========================");

        String str2 = "ttttyyyyyuuuuuuuiiiiiiaaaaaaaaa";

        str2 = new LinkedHashSet<>( Arrays.asList(str2.split(""))).toString() ;

        System.out.println(str2);

        str2 = str2.replace("[", "").replace(", ", "").replace("]","");

        System.out.println(str2);


        System.out.println("=========================");

        String wrd1 = "abcabc";
        String wrd2  = "cab";

        wrd1 = new TreeSet<>( Arrays.asList(wrd1.split(""))).toString() ;
        System.out.println("wrd1 = " + wrd1);
        wrd2 = new TreeSet<>( Arrays.asList(wrd2.split(""))).toString() ;
        System.out.println("wrd2 = " + wrd2);

        boolean vrfy=wrd1.equalsIgnoreCase(wrd2);
        System.out.println("vrfy = " + vrfy);

        System.out.println("=========================");

        String a1 = "abcabc";
        String a2  = "cab";

        HashSet<String> b1=new HashSet<>();
        b1.addAll(Arrays.asList(a1.split("")));
        System.out.println("b1 = " + b1);

        HashSet<String> b2=new HashSet<>();
        b2.addAll(Arrays.asList(a2.split("")));
        System.out.println("b2 = " + b2);

        boolean vrfy2=b1.equals(b2);
        System.out.println("vrfy2 = " + vrfy2);

        System.out.println("=========================");



        System.out.println("=========================");

        String [] names={"Aalia", "Mustafa", "Elkem", "Aalia", "Alia", "Virginia"};

        LinkedHashSet<String>set1=new LinkedHashSet<>();
        set1.addAll(Arrays.asList(names));
        System.out.println("set1= "+set1);

        //toArray : two toArray methods mevcut burada collection type  toArray ile cevirdik
        names = set1.toArray(new String[0]);// boylece any sort of collection type to an array // burdaki 0 sirdan 1 de olabilr
        System.out.println(Arrays.toString(names));
// bura temperary variable olarak birtanes set1 kullandik
        //PEKI TEMPERARY VERIABLE KULLANMAK ISTEMEZ ISEK NE OLUR
        String [] names2={"Roman", "Abzal", "Nurbiye", "Roman", "Roman", "Roman", "Roman"};
        //linkedhashset ile hem dublicatelar gider hemde sira kalir

        names2=new LinkedHashSet<>(Arrays.asList(names2)).toArray(new String[0]); // bu collection type ister dolayisiyal array collecton type cevrilmeli bulk operation ile
        System.out.println("names2 = " + Arrays.toString(names2));// temperal bir varialbe kullanmadadan bir anda oldu hurra

        System.out.println("=========================");

        Integer [] numbers= {1,1,1,2,2,2,2,0,0,0,0,0,1,1,1,2,3,4,5,6,7,8,9};

        numbers=new TreeSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);
        System.out.println("numbers = " + Arrays.toString(numbers));


    }

}
