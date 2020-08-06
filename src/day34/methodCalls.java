package day34;
import Library.Util;

import java.util.Arrays;

public class methodCalls {
    public static void main(String[] args) {
        //impoort class from Libraary and use it
    Integer arr1[]={1,2,3,4,5};
    Integer arr2 []={6,7,8,9,0};
    Integer arr3 []= Util.combine2Arrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    Integer max=Util.maxNum(arr3);
        System.out.println(max);

    Integer min=Util.minNum(arr3);
    int min1=Util.minNum(arr3);//unboxing
    System.out.println(min);

    Character ch[]={'A', 'B','C','D','E'};
    ch=Util.sortDesc(ch);
        System.out.println(Arrays.toString(ch));


    }
}
