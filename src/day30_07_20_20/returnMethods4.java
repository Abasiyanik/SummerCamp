package day30_07_20_20;

import java.util.Arrays;

public class returnMethods4 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4};
        int [] arr2={3,4,5,8};
        int [] arr4=combine2arrays(arr1,arr2);
        System.out.println(arr4[arr4.length-1]);//


    }

    //task 3  ::: combine two integer arrays
    // {1,2,3} {4,5,6} ==>{1,2,3,4,5,6}
    public static int[] combine2arrays(int[]arr1, int[]arr2){

        int [] arr3=new int[arr1.length+arr2.length];

        int i=0;
        for (int each:arr1){
            arr3[i]=each;
            i++;
        }
        for (int each:arr2){
            arr3[i]=each;
            i++; }
        System.out.println(Arrays.toString(arr3));//hem return yapar hem de print eder.
return arr3;

    }
}
