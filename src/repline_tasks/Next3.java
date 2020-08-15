package repline_tasks;

import java.util.Scanner;

public class Next3 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);
    }

    public static void next3(int n){
        System.out.println ((n+1)+" "+(n+2)+" "+(n+3));


    }
}
