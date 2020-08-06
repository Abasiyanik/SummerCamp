package repline_tasks;

import java.util.Scanner;

public class startsropalphabet {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        for (char a=start; a<=end; a++)
            System.out.print(a);
    }
}
