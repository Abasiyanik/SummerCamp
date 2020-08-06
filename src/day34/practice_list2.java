package day34;

import java.util.ArrayList;

public class practice_list2 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(40);
        list.add(234);
        list.add(89);
        list.add(-2);
        list.add(23232);

    for (Integer each:list){
        if (max<each){
            max=each;
        }
        if (each<min){
            min=each;
        } }
        System.out.println(min);
        System.out.println(max);
    }
}
