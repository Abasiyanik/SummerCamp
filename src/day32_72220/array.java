package day32_72220;

import java.util.Arrays;

public class array {
    //task :3. write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array
    //        Ex:
    //            int[] arr = {1,2,3};
    //            int num = 4;
    //            addElement(arr, num); ===> {1,2,3,4}
    public static void main(String[] args) {



    int[] arr1 = {1,4,3};
    int num = 4;
    int [] arr2=new int[arr1.length+1];
        int i=0;
        for (int each:arr1){
            arr2[i]=each;
            i++;
        }
        arr2[arr2.length-1]=num;

        System.out.println(Arrays.toString(arr2));
    //////////add note
        System.out.println(" =============================== ");

        int [] scores={12,23,34, 67, 78, 78};
        int score3=56;

        scores= addElemt(scores, score3);

        System.out.println(Arrays.toString(scores));

        System.out.println("=========================");
        //benzerini call yaparak





    }
    public static int [] addElemt (int[] arr, int num){
        int [] arr2=new int[arr.length+1];
        int i=0;
        for (int each:arr){
            arr2[i]=each;
            i++;
        }
        arr2[arr2.length-1]=num;

        return arr2; }

}
