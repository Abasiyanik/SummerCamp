package repline_tasks;

import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text=scan.nextLine();
        int ln=text.length();
        System.out.println("Lenght is: "+ln);
    }
}
