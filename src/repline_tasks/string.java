package repline_tasks;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int a=word.length()/2;
        String repeat=word.substring(0,a);
        System.out.println(repeat+repeat);
        scan.close();







    }
}
