package repline_tasks;

public class q12 {
    public static void main(String[] args) {
        int a=0;
        do{
            System.out.println(a+"pre");
           a= a++ + --a - (a%3);
            System.out.println(a+"post");

        } while (++a<4);
        System.out.println(a);
    }
}
