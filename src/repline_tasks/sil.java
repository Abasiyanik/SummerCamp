package repline_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class sil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        //int[] ends = {0, 0, 0, 0, 0, 0, 0, 0,};
        int [] ends=new int [inhabitants.length];  //default value of a empty int array is {0,0,0,0,0,0,0,0}
        int days = 0;
        System.out.println("Day " + days + " " + Arrays.toString(inhabitants));  // day zero
        while (!Arrays.equals(inhabitants, ends)) { // this loop when inhabitants becomes all zero like int [] ends
            for (int i=0;i<=inhabitants.length-1;i++){
                if(i<inhabitants.length-1) { // since we are using i+1 to check right next element, to avoid index out of bound, i cant repline_tasks.equal to last index
                    if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) { // if there is 0 next to i, inhabitants[i]/=2;  [4,0,..] ==> [2,0..]
                        inhabitants[i]/=2;
                    }else if(inhabitants[i]==0&&inhabitants[i+1]!=0){  // [0,4...]
                        inhabitants[i+1]/=2;  // at this point, i+1 values will be update if it meets the condition, and loop will start again
                        i++;     // to avoid loop start with this already update value, increase the value by one to skip loop starts with next value which is (i+1)
                    }
                }
            }
            days++;
            String result = "Day " + days + " " + Arrays.toString(inhabitants);
            System.out.println(result);
        }
        System.out.println("---- EXTINCT ----");
    }




    }

