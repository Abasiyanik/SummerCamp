package repline_tasks;

import java.util.Scanner;

public class utopiatree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int tree= scan.nextInt();
        if (tree<0){System.exit(0);}

        switch (tree) {
            case 0:
            case 1:
                System.out.println("year "+tree+" - growth "+tree+" cm");
                System.out.println("tree size: "+tree+"cm");
                break;
            case 2:
            case 3:
                System.out.println("year "+tree+" - growth 1 cm");
                System.out.println("tree size: "+tree+"cm");
                break;
            default:
                System.out.println("year "+tree+" - growth 2 cm");
                System.out.println("tree size: "+(tree*2)+"cm");

        }

    }
}
