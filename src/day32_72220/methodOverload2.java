package day32_72220;

public class methodOverload2 {
    public static void main(String[] args) {

        additin2numbers(30,40);
        additin3numbers(30, 40,50);
        additin4numbers(30,40,50, 60);

        System.out.println("================");

        additionNumbers(30,40);
        additionNumbers(30,40,50);
        additionNumbers(30,40,50,60);
        




    }


    public static void additin2numbers(double a, double b){
        System.out.println(a+b);
    }
    public static void additin3numbers(double a, double b, double c){
        System.out.println(a+b+c);
    }
    public static void additin4numbers(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }



    public static void additionNumbers(double a, double b) {
        System.out.println(a+b);
    }
    public static void additionNumbers(int a, int b) {
        System.out.println(a+b);
    }


    public static void additionNumbers(double a, double b, double c){
        System.out.println(a+b+c);
    }



    public static void additionNumbers(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }

}
