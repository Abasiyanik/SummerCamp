package repline_tasks;
/*
example1- inhabitants is 6

Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----

example2- inhabitants is 0
---- EXTINCT ----

example3- inhabitants is 20
Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ----

 */
import java.util.Scanner;

public class zombiw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        System.out.println("inhabitants is "+inhabitants);
        int i=0;
        while (inhabitants>=1){
            System.out.println("Day "+i+ " ["+inhabitants+"]");
            inhabitants/=2;
            i++;
        }
        System.out.println("---- EXTINCT ----");

    }
}
