package repline_tasks;

import java.util.*;

public class loopchar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        char [] ch= word.toCharArray();
        for (char a:ch){
            System.out.println(a);

        }
    }
}
