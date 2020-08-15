package repline_tasks;

import java.util.Scanner;

public class Bigger {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int max=s.nextInt();
        System.out.println(maxo(x,max));


    }

    public static int maxo(int x,int  max){
        if (x>max)
        {max=x;
            return max;} else {
            return max;
        }
        //return;

    }

}
