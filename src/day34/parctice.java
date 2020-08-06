package day34;

import java.util.Arrays;

public class parctice {

    //task : to convert repline_tasks.string to a number

    public static void main(String[] args) {
        String [] num1={"2.3", "24.3", "33.4","23.32"};
        //lets convert it to dobule array
        double num2 []=new double[num1.length];

        for (int i=0; i<=num1.length-1;i++ ){
            //num2[i]=(int)num1[i];
            num2[i]=Double.parseDouble(num1[i]);//repline_tasks.string numbera donusturulur


        }
        System.out.println(Arrays.toString(num2));


    }
}