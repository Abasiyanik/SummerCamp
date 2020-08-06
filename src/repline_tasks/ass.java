package repline_tasks;

import java.util.Scanner;

public class ass {
    public static void main(String[] args) {
        /*
        Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

The program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behavior:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickel

Negative behavior:

If itemPrice is less than 25 or more than 100 cents, then display an error message:
Invalid price!

If itemPrice is not divisible by 5, then also display an error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.
         */
        Scanner scan=new Scanner (System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String s1=scan.next();
        double d1=scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String s2=scan.next();
        double d2=scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String s3=scan.next();
        double d3=scan.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String s4=scan.next();
        double d4=scan.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String s5=scan.next();
        double d5=scan.nextDouble();

        String summary= "Summary: "+s1+" - "+d1+", "+s2+" - "+d2+", "+s3+" - "+d3+", "+s4+" - "+d4+", "+s5+" - "+d5;
        double average=(d1+d2+d3+d4+d5)/5;

        System.out.println(summary);
        System.out.println("Your average score is: "+average);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");








    }
}
