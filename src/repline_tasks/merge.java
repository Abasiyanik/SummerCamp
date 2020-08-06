package repline_tasks;

import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        if (word1.length()==3&&word2.length()==3){
            char w1=word1.charAt(0);
            char w3=word1.charAt(1);
            char w5=word1.charAt(2);
            char w2=word2.charAt(0);
            char w4=word2.charAt(1);
            char w6=word2.charAt(2);

            System.out.println(""+w1+w2+w3+w4+w5+w6);
        } else {
            System.out.println("cannot repline_tasks.merge");


        }}}