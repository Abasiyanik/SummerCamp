package day42_Static;

public class Tester {
    /*
      create a class called MyScrumTeam:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
                    Answer the interview question "Tell me about your scrum team"
Collapse
     */
    String name;
    char gender;
    long employessID;
    String jobTitle;
    double salary;


    public void setInfo(String name, char gender, long employessID, String jobTitle, double salary){
     this.name=name;
     this.gender=gender;
     this.employessID=employessID;
     this.jobTitle=jobTitle;
     this.salary=salary;
     }

    public void smokeTesting(){
        System.out.println(name+" smoke testing");

    }

    public String toString(){

        return "Name: "+name+", Gender: "+gender+", Job Title"+jobTitle+", Salary"+salary+", EmployeeID: "+employessID;

    }


}
