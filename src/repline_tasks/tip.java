package repline_tasks;

import java.util.Scanner;

public class tip {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        String b="";
        int c=0;
        do {
            b=b+"&";
            System.out.println(b);
            c++;
        } while (c<a);
        System.out.println("b="+b);


    }
}
