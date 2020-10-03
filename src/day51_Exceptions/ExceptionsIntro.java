package day51_Exceptions;

//import org.w3c.dom.ls.LSOutput;

public class ExceptionsIntro {
    public static void main(String[] args) {//throws InterruptedException


        int[] arr = {1, 2, 3};
        System.out.println(arr[1]);
       // System.out.println(arr[100]);//unchecked exceptions (unexpected events)
        //burda complier hatayi fark edemez ve dolayisiyla buna unexpexted oluyor

        // Thread.sleep(3000);// checked exceptions (unwanted event)
        //burda ise exception complier tarafindan fark edilir ve buna checked exceptions adi verilir

        System.out.println("aha");
        String str="Cybertek";
        System.out.println(str.charAt(-1));// bu bir unchecked error cunku -1 index number olmaz ve step burada kalir

        System.out.println("step 2");




    }
}
