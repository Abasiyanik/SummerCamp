package day26_7_14;

import org.w3c.dom.ls.LSOutput;

import java.time.chrono.HijrahEra;
import java.util.Arrays;

public class multidimensionalArrays {
    public static void main(String[] args) {


    int [][] arr2D1={{1,2,4},{4,5,7},{9,0,12}};
    int a=arr2D1[2][0];//9
    System.out.println(a);

        System.out.println("==============================");

        char [] ch1={'A','B'};
        char [] ch2= {'C', 'D', 'E'};
        char [] ch3= { 'F', 'G', 'H'};

        //               0    1     0    1    2      0    1    2
        char [][] ch2D={{'A','B'},{'C', 'D', 'E'},{ 'F', 'G', 'H'}};
        //                  0               1           2


        System.out.println(Arrays.toString(ch2D[2]));//only print the lst single

        System.out.println(ch2D[2][2]);// retrieve H
        System.out.println(ch2D[1][0]);// retrieve C

        System.out.println(ch1[0]);
        //               0  1 2   0    0 1    0 1 2
        int [][] nums= {{1,2,3}, {4}, {5,6}, {7,4,9}};
        //                  0      1    2       3

        System.out.println(Arrays.toString(nums[3]));

        System.out.println(nums[2][1]);

        for (int i=0; i<=nums.length-1; i++){
            System.out.println(Arrays.toString(nums[i]));

        }
        for(int[] each: nums){
            System.out.println(Arrays.toString(each));
        }// print all
        System.out.println(Arrays.deepToString(nums));














}}
