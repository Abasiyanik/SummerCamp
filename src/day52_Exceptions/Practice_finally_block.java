package day52_Exceptions;

public class Practice_finally_block {
    public static void main(String[] args) {


        try {
            System.out.println(9 / 0);// burada bir unchecked exception var

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());//  bu print olur:  / by zero

        }
        try {
            System.out.println(7 / 0);// burada bir unchecked exception var

        } catch (Exception e) {// bu execution olmaz
            System.out.println("bolock catch");//  bu print olur:  / by zero

        } finally {
            System.out.println("fanilly block");
        }// burada

        System.out.println("half way");//burasida executed olur

        try {
            System.out.println(8 / 0);// burada bir unchecked exception var

        } catch (ArrayIndexOutOfBoundsException e) {// bu execution olmaz zira yanlis exception
            System.out.println("hello world");//  bu print olmaz

        } finally {
            System.out.println("fanilly block");//burasi executed olur
        }

        System.out.println("completed");// burasi executed olmaz


    }
}