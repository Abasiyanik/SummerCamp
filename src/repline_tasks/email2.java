package repline_tasks;

import java.util.Scanner;

public class email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String email = scan.next();
        //Scanner scan=new Scanner(System.in);
        String email="abas_yanik@gmail.com";

        int a=0; int b=0; int c=0;
        String first, second, domain, topdomain;

        if (!email.contains("_")){
            System.out.println(email);
            System.exit(0);} else{

            a=email.indexOf("_");
            b=email.indexOf("@");
            c=email.lastIndexOf(".");

            System.out.println("First name: "+ email.substring(0,1).toUpperCase()+
                    email.substring(1,a));
            System.out.println("Second name: "+ email.substring(a+1,a+2).toUpperCase()+
                    email.substring(a+2,b));
            System.out.println("Domain: "+ email.substring(b+1,c));
            System.out.println("Top-Level Domain: "+ email.substring(c+1));
    }
}}
