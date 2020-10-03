package day48_Inheritance.EmployeeTask;

public class Employee {
    public double salary;
    public String name;
    public String ID;
    public String jobTitle;
    public char gender;

    public void setInfo(double salary, String name, String ID, String jobTitle, char gender) {
        this.salary = salary;
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }


    public String toString() {
        return "Employee Info" + "\n ================" + "\n Name: "+name+
                ", ID:  " + ID + ", Gender :" +gender +"\n========================="+
                "\nJobTitle= " + jobTitle + ", Salary= " + salary+"\n=============================";
    }
}
