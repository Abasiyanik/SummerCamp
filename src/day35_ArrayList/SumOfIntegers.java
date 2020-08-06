package day35_ArrayList;

import java.util.ArrayList;

/*
 2. write a program that can return the sum of all the digits from a repline_tasks.string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)

 */
public class SumOfIntegers {
    public static void main(String[] args) {
        String str="a1b2c3";
        int sum=0;
        //ArrayList <Character> ch=new ArrayList<>();
        for (int i=0; i<=str.length()-1;i++){
          char each=str.charAt(i);
          if (each>=48 && each<=57){
            sum +=Integer.parseInt(""+each);// stringi integer a donusturur
            //sum+=a;
          }
        }
        System.out.println(sum);

        System.out.println("===================================");


    }
}
