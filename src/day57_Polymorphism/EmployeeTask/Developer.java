package day57_Polymorphism.EmployeeTask;

public class Developer extends Employee{
    public Developer(String name, String jobTitle,int id, double salary, char gender) {
        super(name,jobTitle, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+ " "+ name+" is testing");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                "} " + super.toString();
    }
}

