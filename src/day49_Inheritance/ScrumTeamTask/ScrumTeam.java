package day49_Inheritance.ScrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    /*
     create a class called ScrumTeam
                    Attributes:
                            ArrayList<Tester> testers = new ArrayList<>(),
                            ArrayList<Developer> developers = new ArrayList<>(),
                    Actions:
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist

     */
    public ArrayList<Tester> testers = new ArrayList<>();   //ikiside ayni packagede oldugu icin import gerek yok yoksa gerek olacaktir
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(Tester [] testers, Developer [] developers){// bu bir constrctroctor ama advanced ve biz arrayi oldugu gibi herife boca ettik
        addTesters(testers);
        addDevelopers(developers);

    }
    public void addTester(Tester tester) {
        testers.add(tester);
    }// amacimiz bir sey ekleyecegim

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }// add develeoper to the arraylist

    public void addTesters(Tester [] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDevelopers(Developer [] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(long ID){
        testers.removeIf(p-> p.ID==ID);
    }

    public void removeDeveloper(long ID){
        developers.removeIf(p->p.ID==ID);
    }

    public void removeTesterDeveloper(int testerID, int developerID){
        removeTester(testerID);
        removeDeveloper(developerID);
    }// bu hem developer ve hemde testeri remove eder.

    public String toString(){
        return "================================"+
                "\nDevelopers #"+developers.size()+
                "\nTesters #"+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+ " point (Dev.Team * 8 Days)"+
                "\nVelocity: "+((developers.size()+testers.size())*8)+ " point for current Sprint (No days Off)"+
                "================================";
    }

}
