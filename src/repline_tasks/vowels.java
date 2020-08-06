package repline_tasks;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    char [] vowels={'e', 'i', 'o','u','a'};
    char[] ch=word.toCharArray();

    for (char a:ch){

        for (char b:vowels){
            if (a!=b){ continue;}
                System.out.print(a);
            }
        }





}}
