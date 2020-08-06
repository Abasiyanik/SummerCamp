package repline_tasks;

import java.util.Scanner;

public class task_july_1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        //wtrirte a program repline_tasks.reverse it.

        //String str="Java";
        String str=s.next();

        String s1,s2,s3, s4;
        s1=str.substring(0,1);
        s2=str.substring(1); //bunda 1. ile sonu arasinda hepsini alir
        s3= s2+s1;

        System.out.println(s3);

        // charAt le de yapilir
        char a,b,c,d;
        a=str.charAt(0);
        s4=""+s2+a;
        System.out.println(s4);// charAT ile oldu




    }




}
