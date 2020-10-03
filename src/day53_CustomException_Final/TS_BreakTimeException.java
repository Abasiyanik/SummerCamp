package day53_CustomException_Final;

import repline_tasks.time;

import java.sql.Time;

public class TS_BreakTimeException extends RuntimeException {// custom unchecked exception
    // this is the class for

    public TS_BreakTimeException(){
        super("it is a break time");
        System.err.println("blabla");
    }

    public TS_BreakTimeException(String ana){// bir constructor aciyoruz ama burada super ile digerinin metodunu yaziliyor.
        super(ana);// istersek buraya eklemeler yapalim

        //super();// bu super paretnttan alir ve yazar burada super class ile

        System.err.println("Time to take 15 min break");// kirmizi yapar
//        Time to go
//        Exception in thread "main" day53_CustomException_Final.TS_BreakTimeException: it is time for a break
    }
}
    class Test {

        public static void main(String[] args) {
       // throw new RuntimeException("This is Runtime exception");//Exception in thread "main" java.lang.RuntimeException: This is Runtime exception
           //  throw new RuntimeException(); //bu mesajsiz olur  //Exception in thread "main" java.lang.RuntimeException
           //throw new TS_BreakTimeException("please give me break");
        //    System.out.println("dfdf");
            throw new TS_BreakTimeException();// blalba it is a break time
        }
    }

