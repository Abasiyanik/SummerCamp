package repline_tasks;
//email -> info@cybertekschool.com
//Print:
//Email id: info
//Email domain: cybertekschool.com

import java.util.Arrays;

//email -> hello-gmail.com
//print:
//invalid email
//
//email -> my@fancy@email.com
//print:
//invalid email
public class email_split {
    public static void main(String[] args) {
        String email ="my@fancy@email.com";
        if (!email.contains("@") ){
            System.out.println("invalid email");
            System.exit(0);
        }
        String [] splitEmail=email.split("@",3);
        if (splitEmail.length>2){
            System.out.println("invalid email");
            System.exit(0);
        }
        System.out.println("Email id: "+splitEmail[0]);
        System.out.println("Email domain: "+splitEmail[1]);

        //System.out.println(Arrays.toString(splitEmail));
        }
}
