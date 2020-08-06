package repline_tasks;//import java.sql.SQLOutput;
import java.util.Scanner;

public class shopping {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter Item1. count and its price:");
        String I1=scan.next();
        int c1=scan.nextInt();
        double p1=scan.nextDouble();
        double t1=c1*p1;

        System.out.println("Enter Item2. count and its price:");
        String I2=scan.next();
        int c2=scan.nextInt();
        double p2=scan.nextDouble();
        double t2=c2*p2;

        System.out.println("Enter Item3. count and its price:");
        String I3=scan.next();
        int c3=scan.nextInt();
        double p3=scan.nextDouble();
        double t3=c3*p3;

        boolean b2=c2==0;

        if (!b2) {
            System.out.println("Item 1: "+I1+" Price: "+t1+", "+"Item 2: "+I2+" Price: "+t2);
             } else {
            System.out.println("Item 1: "+I1+" Price: "+t1+", "+"Item 3: "+I3+" Price: "+t3);
        }


        //String print = (c3==0)? "Item 1: "+I1+" Price: "+t1+", "+"Item 2: "+I2+" Price: "+t2 : "Item 1: "+I1+" Price: "+t1+", "+"Item 3: "+I3+" Price: "+t3;
        //System.out.println(print);
        System.out.println("Total price : "+ (t1+t2+t3));

                                   //     "Item 1: "+I1+" Price: "+t1+", "+"Item 2: "+I2+" Price: "+t2+", "+"Item 3: "+I3+" Price: "+t3 :



    }
}
