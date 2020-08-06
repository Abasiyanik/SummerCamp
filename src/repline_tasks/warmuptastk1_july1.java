package repline_tasks;

import java.util.Scanner;

public class warmuptastk1_july1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String firstName =scan.next();
        String lastName = scan.next();


        String initial1 = firstName.substring(0, 1)+ "." + lastName.substring(0,1); // "jp"
        initial1 = initial1.toUpperCase();  // "JP"

        System.out.println(initial1);




        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);

        String initial2 ="" + ch1+ "." + ch2;
        initial2 =  initial2.toUpperCase();

        System.out.println(initial2);

    }
}
