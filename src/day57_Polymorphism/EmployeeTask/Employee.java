package day57_Polymorphism.EmployeeTask;

public abstract class Employee {
    public String name, jobTitle;
    public int id;
    public double salary;
    public char gender;

    public Employee(String name, String jobTitle, int id, double salary, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.gender = gender;
    }

    public  abstract  void work();
    //public  abstract  void work();


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
