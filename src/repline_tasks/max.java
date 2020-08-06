package repline_tasks;

//import java.util.Scanner;

public class max {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        int[] numb = {1,12,3,4,5};
        int max=numb[0];
        for (int i=1; i<=numb.length-1;i++){
            if (max<numb[i]){
                max=numb[i];
            }


        }
        System.out.println(max);
    }
}
