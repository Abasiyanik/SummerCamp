package day34;

import java.util.Scanner;

public class find_min_max {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=1; i<=10; i++){//10 numara gir
            System.out.println("enter an integer number");
            int n=scan.nextInt();
            if (n>max){
                max=n;
            }
            if (n<min){
                min=n;
            }
        }
        System.out.println("minimum "+min);
        System.out.println("maximim "+max);
    }
}
