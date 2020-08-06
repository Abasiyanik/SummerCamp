package day33;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dataformatting {
    public static void main(String[] args) {
        // May 20 2019 Dayname, 04:30 Pm yazdiracaz

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd EEEE HH:mm");//AM/PM istersek a ekleriz
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm");

        // yy 20 verr MMM Jly verir MMMM July verir EEEE Sunday verir

        LocalDateTime dt=LocalDateTime.of(2019, 05, 20, 16, 30);

        System.out.println(dt);
        System.out.println(dt.format(dtf));
        System.out.println("fgf");
// bunu bugunumuze de uygulayavliiriz

        LocalDateTime today=LocalDateTime.now();
        int month=today.getMonthValue();//return the month as number
        int year=today.getYear();// returns the year
        int day=today.getDayOfMonth();//returns the day

        System.out.println(month+" "+year+" "+day);
        System.out.println(today.format(dtf));
        System.out.println(today.format(dtf2));



    }
}
