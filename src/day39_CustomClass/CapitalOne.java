package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();
        Employee employee6=new Employee();

        employee1.setEmployeeInfo("Roma", 'M', 12345678, "QA", 120000);
       // employee1.getEmployeeInfo();
        employee2.setEmployeeInfo("Meri", 'F', 1234345378, "QA", 120000);
        employee3.setEmployeeInfo("Musa", 'M', 123645378, "SDET", 135000);
        employee4.setEmployeeInfo("Ramazan", 'M', 344345378, "SDET", 150000);
        employee5.setEmployeeInfo("Meri", 'F', 1234345378, "QA", 121000);
        employee6.setEmployeeInfo("Tatianna", 'F', 545343453, "SDET", 155000);


        //employee1.getEmployeeInfo();
        ArrayList <Employee> employeeList=new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1,employee2, employee3, employee4, employee5, employee6));
        for (Employee each:employeeList){
            each.getEmployeeInfo();
        }
        //how to find out the one who has the maximum salary
        double max=Integer.MIN_VALUE;
        String name="";
        for (Employee each:employeeList){
            double eachSalary=each.salary;
            if (eachSalary>max){
                max=eachSalary;
                name=each.name;
            }
        }
        System.out.println("Maximum Salary: "+max);
        System.out.println(name+" has the maximum salary");

        //remove the ones who has slary less than 1500000
        employeeList.removeIf(p->p.salary<150000);
        //employeeList.removeIf((p->p.jobTitle.equals("QA")))

        System.out.println("+++++++++++++++++++++++");
        System.out.println("Employess with >150000 salary:");
        for (Employee each:employeeList){
            //each.getEmployeeInfo();
            System.out.println(each.name+" :"+each.salary);
        }

    }
}
