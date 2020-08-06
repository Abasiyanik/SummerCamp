package repline_tasks;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String word=scan.next();
        int a=word.length();
        if (a==5) {
        char a1=word.charAt(0);
        char a2=word.charAt(1);
        char a3=word.charAt(2);
        char a4=word.charAt(3);
        char a5=word.charAt(4);
        String reverse= "";
        reverse= ""+a5+a4+a3+a2+a1;
            System.out.println(reverse);

        } else if (a<5) {
            System.out.println("Too short!");
        } else {
            System.out.println("Too long!");
        }
    }
}
