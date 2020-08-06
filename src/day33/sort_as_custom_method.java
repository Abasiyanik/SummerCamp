package day33;

import java.util.Arrays;

public class sort_as_custom_method {
    public static void main(String[] args) {
        int [] arrh={3,46,7,8,98,4,5,6};

        arrh=sortDesc(arrh);
        System.out.println(Arrays.toString(arrh));


    }

    public static int [] sortDesc (int [] arr){
       Arrays.sort(arr);
       int []arr2= new int[arr.length];
        int k=0;
        for (int i=arr.length-1; i>=0;i--){
            arr2[i]=arr[k];
            k++;
        }

        return arr2;//
    }
}
