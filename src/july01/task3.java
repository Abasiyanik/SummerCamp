package july01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


    //emaillerdeki domaini al
        System.out.println("enter email");
        String email=s.next();
    //String email="cybertek@gmail.com";
    int index=email.indexOf("@");
    int index2=email.lastIndexOf(".");
    //String domain=email.repline_tasks.substring(index+1,email.repline_tasks.length()-4);
        String domain=email.substring(index+1,index2);
        System.out.println(domain);

}
}