package day43_static;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    static int[] arr=new int [3];
    static ArrayList list=new ArrayList<>();
    static{// static block sadece bir kere calisir

        arr[0]=1;
        arr[1]=2;
        arr[2]=2;

        list.addAll(Arrays.asList(4,5,6));
        System.out.println("ststic block exexuted 1 time");


    }
}
