package repline_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class zombi22 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int[] inhabitants = new int[8];
            for(int i=0; i<inhabitants.length; i++) {
                inhabitants[i] = input.nextInt();
            }

            int [] ends=new int [inhabitants.length];
            int days = 0;
            System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
            while (!Arrays.equals(inhabitants, ends)) {
                for (int i=0;i<=inhabitants.length-1;i++){
                    if(i<inhabitants.length-1) {
                        if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
                            inhabitants[i]/=2;
                        }else if(inhabitants[i]==0&&inhabitants[i+1]!=0){
                            inhabitants[i+1]/=2;
                            i++;
                        } }
                }
                days++;
                String result = "Day " + days + " " + Arrays.toString(inhabitants);
                System.out.println(result);
            }
            System.out.println("---- EXTINCT ----");
        }

}
