package day47_Encapsulation;
/*
 2. create a class called CapitalOneEmployees
                instance variables:
                        employeeName
                        employeeAge
                        jobTitle
                    private ID
                    private salary
                    private address
                    company name = "Capital One"
                    generate getters & setters for private variables

 */
public class Task2_Employee {
    String employeeName;
    int employeeAge;
    String employeeJobTitle;


    public Task2_Employee(String employeeName, int employeeAge, String employeeJobTitle) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeJobTitle = employeeJobTitle;
    }
    private long employeeID;
    private double employeeSalary;
    private String employeeAddress;
    public static String companyName="Capital One";

    //static{companyName="Capital ONe";} // bu da kullanilabilir

    public long getEmployeeID() {
        return employeeID;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    //getters
    /*
    public long getEmployeeID() { return employeeID; }
    public double getEmployeeSalary() {  return employeeSalary;}
    public String getEmployeeAddress() { return employeeAddress;}

     */
//setters
    public void setEmployeeID(long employeeID) { this.employeeID = employeeID;}
    public void setEmployeeSalary(double employeeSalary) {this.employeeSalary = employeeSalary;}
    public void setEmployeeAddress(String employeeAddress) {this.employeeAddress = employeeAddress;}
//toString



    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeeJobTitle='" + employeeJobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", employeeSalary=" + employeeSalary +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", Company Name= "+companyName+
                '}';
    }

}

