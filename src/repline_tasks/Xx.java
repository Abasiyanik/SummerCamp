package repline_tasks;

import java.util.Scanner;

public class Xx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.indexOf("x")==0 || word.indexOf("X")==0){
            word=word.substring(1);
        }
        int a=word.length()-1;
        if (word.lastIndexOf("x")==a || word.lastIndexOf("X")==a){
            word=word.substring(0,word.length()-1);
        }
        System.out.println(word);
    }
}
