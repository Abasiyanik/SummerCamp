package repline_tasks;

import java.util.Scanner;

public class equal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        String print="";
        print = (word1.equals(word2))? word1+" equals "+word2: word1+" does not repline_tasks.equal "+word2;


        System.out.println(print);
    }
   // public static void repline_tasks.main(String[] args) {

   // }
}
