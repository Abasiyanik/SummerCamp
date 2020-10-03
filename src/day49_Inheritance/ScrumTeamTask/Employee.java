package day49_Inheritance.ScrumTeamTask;
/*
  create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo

 */
public class Employee extends Person{

    public double salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name, int age, char gender, double salary, int ID, String jobTitle){
        setInfo(name, age, gender);
        this.salary=salary;
        this.ID=ID;
        this.jobTitle=jobTitle;
    }
    //we overloaded setInfo method. we have just changed the parameters and added extra 3 arguments


    public void work (){
        System.out.println(name+" is working as"+jobTitle);
    }

    public String toString() {
        return "Name is "+name+ ", age is "+age+", gender type: "+gender+", Salary= $"+salary+", Employee ID: "+ID
                +", Job title is: "+jobTitle;
}}

