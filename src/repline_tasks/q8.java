package repline_tasks;

import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        byte [] b=new byte [5];
        for (int j=0; j<b.length; j++){
            b[j]=(byte)(b[j]*2);

        }
        System.out.println(Arrays.toString(b));
    }
}
