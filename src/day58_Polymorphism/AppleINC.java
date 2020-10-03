package day58_Polymorphism;
import day57_Polymorphism.EmployeeTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {
    public static void main(String[] args) {


        Employee [] workers = new Employee[]{
                new Tester("Andrii", "QA", 100200, 120000, 'M'),
                new Tester("MFdfA", "SDET", 33345232, 135600, 'F'),
                new Tester("MdfdA", "QA", 3435232, 120600, 'F'),
                new Tester("MFere", "SDET", 3435232, 160600, 'F'),
                new Tester("MFA", "QA", 343232, 150600, 'M'),
                new ScrumMaster("Asana", "scrummaster", 3344232, 121000, 'F'),
                new ScrumMaster("hassan", "scummaster", 3434232, 131000, 'M'),
                new Developer("Asaeen", "Developer", 34232, 161000, 'F'),
                new Developer("Asaeeerern", "Developer", 34232, 131000, 'F'),
                new Developer("Asan", "Tema Laead", 34232, 111000, 'M'),
                new Developer("Asanie", "Dev", 3443232, 136000, 'M')
        };
        ArrayList <Employee> scrumTeam=new ArrayList<>(Arrays.asList(workers));
        int countTester=0;
        int countDeveloper=0;
        int countScrumMaster=0;

        for (Employee each: scrumTeam)
            if (each instanceof Tester) countTester++;
            else if (each instanceof Developer) countDeveloper++;
            else countScrumMaster++;



        /*scrumTeam.forEach(each-> {if (each instanceof Tester){countTester++;}
        else if (each instanceof Developer){ countDeveloper++;}
        else {countScrumMaster++;}});*/

        System.out.println(countTester);
        System.out.println(countDeveloper);
        System.out.println(countScrumMaster);


    }
}
