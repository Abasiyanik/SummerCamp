package repline_tasks;

import java.util.Scanner;

/*
Write a program that will verify if word contains in the sentence.
Print out the result as boolean value.
 */
public class verify_contains {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        boolean verfy=sentence.contains(word);
        System.out.println(verfy);

    }

}
