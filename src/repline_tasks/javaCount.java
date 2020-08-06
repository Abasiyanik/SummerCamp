package repline_tasks;

import java.util.Scanner;

public class javaCount {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int count=0;
        //COZULDU;
        for (int i=0; i<=word.length()-4;i++){
            if (word.substring(i,i+4).equalsIgnoreCase("java")){count++;

            }
            continue;

        }
        System.out.println(count);
    }
}
