package day33;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int [] arr={2,4,5,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int []arr2= new int[arr.length];
int k=0;
        for (int i=arr.length-1; i>=0;i--){
        arr2[i]=arr[k];
        k++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
