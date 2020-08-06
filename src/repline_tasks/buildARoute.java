package repline_tasks;



import java.util.Scanner;

public class buildARoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
      // boolean ab= start.equals("A");
       // System.out.println(ab);
        String [] arr={"A", "B", "C", "D"};
        int k=0;
        for (String each: arr){
            if (end.equalsIgnoreCase(each)){
                //System.out.println("ayni degel");
                //System.exit(0);
                k++;
            }
        }
if (k==0){
    System.exit(0);}
//else{
  //  System.out.println("valid");
//}


        if (start.equals(end)){
            System.out.println(""+start+" found");
            System.exit(0);
        }
        System.out.print("Output: ");
        while (true){

            //System.out.println("a");

            switch (start) {


               case "A":
                   System.out.print("right");
                   if (end.equalsIgnoreCase( "B")) {
                       System.out.print(": B found");
                       System.exit(0);
                   }
                   System.out.print(" > ");

               case "B":
                   System.out.print("down");
                   if (end.equalsIgnoreCase( "C")) {
                       System.out.print(": C found");
                       System.exit(0);
                   }
                   System.out.print(" > ");

               case "C":
                   System.out.print("left");
                   if (end.equalsIgnoreCase( "D")) {
                       System.out.print(": D found");
                       System.exit(0);
                   }
                   System.out.print(" > ");
               case "D":
                   System.out.print("up");
                   if (end.equalsIgnoreCase( "A")) {
                       System.out.println(": A found");
                       System.exit(0);
                   }
                   System.out.print(" > ");
                   start="A";
                default:
            }

        }




    }}