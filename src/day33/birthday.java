package day33;
import java.time.LocalDate;

public class birthday {
    public static void main(String[] args) {
        HappyBirthDay(1970, 07,27);

    }







    public static void HappyBirthDay(int year, int month, int day){
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        System.out.println(today);

        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();

        if(month2 == month && day == day2){
            System.out.println("Today is your birthday!!!");
            System.out.println("   \n \t \t  \t \t    * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("   \t \t  \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println(" \t \t  \t \t*  *          Happy BirthDay To You!         *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println("  \t \t   \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("   \t \t   \t \t    * * * * * * * * * * * * * * * * * * * * *");
            //return;//return kullanirsakta olur o zaman else kullanmaya gerek kalmadan costum method burada
            //sonlanir TATAAM
        }
        else {System.out.println("Today is not your birthday yet");}
    }


}
