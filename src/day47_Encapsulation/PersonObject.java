package day47_Encapsulation;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {
        Person person1=new Person("Fatih", 23, 'M', LocalDate.of(1970,06,12));

        System.out.println(person1);
        person1.setSsn(5334667);
        person1.setID(87);
        person1.setAddress("Chicago");
        System.out.println(person1);

    }
}
