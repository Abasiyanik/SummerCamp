package day49_Inheritance.ScrumTeamTask;

public class Tester extends Employee{

    /*
     create a subclass of Employee called Testers
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
     */
    public Tester(String name,int age,char gender,double salary,int ID, String jobTitle){
        setInfo(name, age, gender, salary, ID, jobTitle);
    }

    public void smokeTesting(){
        System.out.println(name+" is running smoke Test, while drinking coffee!");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket on JIRA");
    }

}
