package day34;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(7);

        for (int i=0; i<=arraylist.size()-2; i++){
            arraylist.set(i+1,0);

       }
        System.out.println(arraylist);
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        int bmax=Byte.MAX_VALUE;

        System.out.println(max);
        System.out.println(min);
        //hellooooo

    }
}
