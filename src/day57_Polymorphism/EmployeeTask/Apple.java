package day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {
    public static void main(String[] args) {

        Employee tester1=new Tester("Andrii", "QA", 100200, 120000, 'M');
        Employee tester2=new Tester("MFA", "SDET", 3435232, 140600,'M');

        Employee developer1=new Developer("Asan", "Tema Laead", 34232, 111000,'F');
        Employee developer2=new Developer("Asanie", "Dev", 3443232, 134000,'F');
        //scrumTeam by suing Arraylist

        Employee scrumMaster1=new ScrumMaster("guguj","scrummaster", 22222, 134431, 'M');
        ArrayList<Employee>scrumTeam=new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester2, developer1,developer2, scrumMaster1));
//bu ancak polymorphism ile olur baska turlu olamaz

        for (Employee each: scrumTeam){
            System.out.println(each.salary+" "+each.name);
            System.out.println(each);

        }



    }
}
