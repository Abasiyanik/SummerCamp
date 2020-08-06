package day30_07_20_20;

import java.util.Arrays;

/*
Topic: Custom Methods continue
                return methods
package name: day30_CustomMethods
wamrmup tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop
methods: function. grouping code fragments

        Access-modifier  Specifier  return-type  methodName(parameter){
                statements;
        }
        Access-modifer: public
        specifier: static
        parameter: any dataType
        methodName (Mandatory): can be any name
        return-Type(Mandatory) : void,  DataType

 */
public class warmup {

    public static void main(String[] args) {
        maxNum(2, 2);// asagidaki blueprint olacak ve biz sadece numaraalri veririz ve sistem otomatik hesaplar-5}
        int arr[]={5,2,4,5,6,7,-3,};// arr verilir ve bu printdesc ile islenir
        printDesc(arr);
        int ar1[]={4,6,7,5};
        int [] ar2={1,2,4,5};
        combine2arrays(ar1,ar2);

    }

    //task 1
    public static void maxNum(int a, int b) {


        //
        if (a == b) {
            System.out.println("Equal");
            return; //exit the method
        }

        if (a > b) {
            System.out.println(a + " is maximum");
        } else {
            System.out.println(b + " is maximum");
        }


    }


    //task 2
    public static void printDesc(int[] arr) { //{10,9,20,,30,5,6,7}
        Arrays.sort(arr);
        //// {5,6,7,9,10,20,30};
        for (int i = arr.length - 1; i>=0;i--){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    //task 3  ::: combine two integer arrays
    // {1,2,3} {4,5,6} ==>{1,2,3,4,5,6}
    public static void combine2arrays(int[]arr1, int[]arr2){

        int [] arr3=new int[arr1.length+arr2.length];

        int i=0;
        for (int each:arr1){
            arr3[i]=each;
            i++;
        }
        for (int each:arr2){
            arr3[i]=each;
            i++; }
        System.out.println(Arrays.toString(arr3));

    }

    //task 4:

    public static void PosNegZero(int num){

        if(num > 0){
            System.out.println(num+" is positive");
        }else if(num <0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }

}}

