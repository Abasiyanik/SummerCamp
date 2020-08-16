package day42_Static;

public class Developer {

    String name;
    char gender;
    long employessID;
    String jobTitle;
    double salary;


    public void setInfo(String name, char gender, long employessID, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.employessID = employessID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void coding() {
        System.out.println(name + " is coding"); }


    public void fixBud() {
        System.out.println(name + " is fixing the bug"); }



    public String toString() {

        return "Name: " + name + ", Gender: " + gender + ", Job Title" + jobTitle + ", Salary" + salary + ", EmployeeID: " + employessID;

    }
}
