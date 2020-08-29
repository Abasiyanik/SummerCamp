package day44_Constructor;
/*
1. Create a class named Pizza that stores information about a single pizza.
        Attributes:
            size, NumOfCheeseTopping, NumOfPepperoniTopping
        Actions:
            set(): sets all info of the pizza
            calcCost(): calculates the price and returns it as double
            toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
            Pizza cost is determined by:
                    Small: $10 + $2 per topping
                    Medium: $12 + $2 per topping
                    Large: $14 + $2 per topping
 */
public class Employee {
    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed;
    static boolean hasSalary;

    static {//bu ilk once calisir
        isEmployed=true;
        hasSalary=true;
    }

    public void setEmployeeInfo(String name, int id, int ssn, String jobTitle, double salary, char gender){
        this.name=name;
        this.id=id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
        //isEmployeed=true;// bu static valueleri buraya da koyabliriz ama her cagrilmada cagrilacagindan sistemi YAVASLATACAKTIR
        //O YUZDE BLOK ICINDE VERILSE DAHA IYI OLUR. BLOK ILK BASTA CALISIR VE BIR KERE CALISIR VE DAHA IYIDIR
        //hasSalary=true;
        }
        public String toString(){

        return "Name: "+name+"\n Gender: "+gender+"\n ID: "+id+"\nSSN: "+ssn+"\n JobTitle: "+jobTitle+
                "\n Salary: "+salary;
        }

}

