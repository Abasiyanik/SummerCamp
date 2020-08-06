package repline_tasks;

import java.util.Scanner;

public class printing3 {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //String[] arr = new String[6];
        String [] arr={"apple", "banana","kiwi", "grape","milk","soda"};
       /* for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();
        }

        */
        //int t = 0;
        for (int k = 0; k<4;  k++){

            System.out.println(arr[k + 0] +" , "+ arr[k + 1] +" , "+ arr[k + 2]); }
    }
}