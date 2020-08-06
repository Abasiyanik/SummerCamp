package day30_07_20_20;

import java.util.Arrays;

public class returnMethod3 {

    public static void main(String[] args) {

        int [] arr={100, 340, 454, 324, 43, 346, 453};
        int num=max(arr);
        System.out.println(num);
        System.out.println(num>300);



    }
//public static void max(int[] arr) {//void olunce return never returns any value
    public static int max(int[] arr) {
        Arrays.sort(arr);
        int max= arr[arr.length-1];// bu value baska hic bir yerde kullanmaayiz ve void oldugu icinde
        // baska yerde void olarak gosteremeyiz dolaiyisyla void yerine int yazildi
        //do
        //return 100; yazsak ne zaman bunu calistirsak bize bu degeri verir dolaiyisle uygun degildir
        return max;// birine lazim olunca mex cagrilir ve max deger olarak kullanilabilir


    }
    public static void max2(int[] arr) {// void oldugu icin hic bir veri dondurulemez.
        Arrays.sort(arr);
        int max= arr[arr.length-1];
        System.out.println(max);

    }
}

