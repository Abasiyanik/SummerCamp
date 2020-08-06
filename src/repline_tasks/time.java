package repline_tasks;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enther the number of minutes");
        int minutes=scan.nextInt();
        for (int i=minutes; i>0; i--){
            if (i<0)
                break;
            for (int z=59; z>=0;--z){
                System.out.println((i-1)+" minutes and " +z+"seconds left");
              //  Thread.sleep(1000);

            }
        }
    }
}
