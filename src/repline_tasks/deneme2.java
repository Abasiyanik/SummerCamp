
package repline_tasks;

public class deneme2 {
    public static void main(String[] args) {
       // method3(50);
        System.out.println(method3(50));
    }
    public static String method3(int num){

        if (num<0) {
            return "A";
        } else if (num<50) {
            return "B";
        } else if (num<100){
            return "C";

        } else {return "D";}

        }
    }

