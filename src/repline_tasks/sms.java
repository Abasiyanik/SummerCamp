package repline_tasks;

import java.util.Scanner;

public class sms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
        String message="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
        int a, b, c, d, e,f;
        a=b=c=d=e=f=0;

        a=message.indexOf("<");
        b=message.indexOf(">");
        c=message.indexOf("[");
        d=message.indexOf("]");
        e=message.indexOf("{");
        f=message.indexOf("}");

        System.out.println("Sender : "+message.substring(a+1,b));
        System.out.println("Phone Number : "+message.substring(c+1,d));
        System.out.println("Message body : "+message.substring(e+1,f));


    }
}
