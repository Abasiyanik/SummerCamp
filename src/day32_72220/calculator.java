package day32_72220;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        /*
        write a return method that accepts two numbers and an operator, then returns calculation result.
             if the oerator is invalid, return zero
             otherwise return the result        */
        Scanner s=new Scanner(System.in);
        System.out.println("enter operator");
        char oper= s.next().charAt(0);
        System.out.println("enter first name");
        double num1=s.nextDouble();
        System.out.println("enter second name");
        double num2=s.nextDouble();

        System.out.println(calculator(num1,num2,oper));



    }
    public static double calculator (double num1, double num2, char oper){
            double result= oper=='+'? num1+num2:oper=='*'? num1*num2: oper=='/'? num1/num2:
                    oper=='-'? num1-num2:0;
        return result;
    }
}
