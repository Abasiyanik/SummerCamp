package repline_tasks;

import java.util.Scanner;

public class teacher {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();
        String print="";
        print= (name.equals("Chen"))? "repline_tasks.teacher" : "student";

        System.out.println(print);






    }
}
