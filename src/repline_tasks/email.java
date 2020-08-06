package repline_tasks;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //String email1=scan.next();
        String email="abas_yanik@gmail.com";
        //String email2=email;
int a=0; int b=0;
        if (!email.contains("_")){
            System.out.println(email);
            System.exit(0);} else{
            a=email.indexOf("_");
            b=email.indexOf("@");
            //System.out.println(""+a+b);
            System.out.println(email.substring(a+1,b)+"_"+email.substring(0,a)+email.substring(b));}
        //email=email.replace(email.repline_tasks.substring(a+1,b), email2.repline_tasks.substring(0,a));//abas_abas@
        //email=email.replace(email.repline_tasks.substring(0,a), email2.repline_tasks.substring(a+1,b));}

        //email=email.replace(email.repline_tasks.substring(a+1,b), email2.repline_tasks.substring(0,a));
        //System.out.println(a);
        //System.out.println(email);
        //System.out.println(email2);

    }
}
