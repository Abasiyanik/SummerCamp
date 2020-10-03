package day52_Exceptions;

public class Practice {
    public static void main(String[] args) {
       // System.out.println(9/0);// burada bir unchecked exception var

try {
    System.out.println(9 / 0);// burada bir unchecked exception var

} catch (ArithmeticException e)
{
    //System.out.println(e);//bu print olur: java.lang.ArithmeticException: / by zero
    System.out.println(e.getMessage());//  bu print olur:  / by zero
    //e.getMessage(); //bir etksi yok

}

        System.out.println("test completed");// bu statement run olmaz zira exception izin vermez.
        // exception handle edilmeli


    }
}
