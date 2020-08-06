package repline_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class zombie {
    public static void main(String[] args) {

        Integer a []={3, 6, 0, 4, 3, 2, 7, 0};
        ArrayList<Integer> b = new ArrayList<Integer>(8);
        //Integer b[]=new int[a.repline_tasks.length];
        


        int sum=1;
        int y=1;
        //boolean a= cities.equals(3);
        //System.out.println(a);
        System.out.println(Arrays.toString(a));

        System.out.println(b.size());
        //System.out.println(b.get(0)+"    222");
        while (y<4){
        for (int i=0; i<=a .length-2; i++) {
            if (a[i] == 0) {
                b.add(i+1,a[i+1]/2);
               // b.set(i+1.a[i+1]/2));
                continue; }

            if (a[i + 1] == 0) {
                b.add(i,  a[i] / 2);
            }
            continue;//else {
               // b[i] = a[i];
            }//}
/*
            for (int k = a.repline_tasks.length - 1; k>=1; k--) {
                if (a[k] == 0) {
                    continue;
                }
                if (a[k - 1] == 0) {
                    b[k] = a[k] / 2;
                } else {
                    b[k] = a[k];
                }
            }

 */
            for (int l = 0; l <= a.length - 1; l++) {
                if (b.get(l)>=0) {
                a[l] = b.get(l);
                sum += a[l];} else {continue;}
            }
            System.out.println(Arrays.toString(a));
            y++;
        }


        }

      //  System.out.println(Arrays.toString(a));





    }

