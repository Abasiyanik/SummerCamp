package day33;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class practice2 {
    public static void main(String[] args) {
        String[] students = {"Kalbinur", "Virginia", "Odina", "Ernis", "Isa"};

        LocalDate[] birthDays  = {
                LocalDate.of(1982,12,26) ,
                LocalDate.of(1993, 11,25),
                LocalDate.of(1980,05,23),
                LocalDate.of(1990,2,21),
                LocalDate.of(1982,11,28)
        };

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy EEEE");
        for (LocalDate each:birthDays)
        {
            System.out.println(each.format(dateFormat));

    }
}}
