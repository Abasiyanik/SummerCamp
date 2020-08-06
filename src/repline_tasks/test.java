package repline_tasks;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();
        String answer=(a.toLowerCase()).trim();

        //String tr="b";
        switch (answer) {
            case "a":
            case "c":
                System.out.println(answer + " is wrong");
                break;
            case "b":
                System.out.println("b is correct");
                break;
            default:
                System.out.println(answer + " is not a valid answer");
        }



       /* }

        if (answer.equals(tr)) {
            System.out.println(tr+" is correct");
        } else {
            System.out.println(answer+" is wrong");}

*/



    }
}
