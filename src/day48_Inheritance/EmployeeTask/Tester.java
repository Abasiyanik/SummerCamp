package day48_Inheritance.EmployeeTask;

public class Tester extends Employee {

    public Tester(double salary, String name, String ID, String jobTitle, char gender) {
        setInfo(salary, name, ID, jobTitle, gender);
    }

    public void findingBugs(){
        System.out.println(name+ " is finding bugs");
    }

    @Override
    public String toString() {
        return "Job Type: Tester" + super.toString();
    }
}
