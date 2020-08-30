package day47_Encapsulation;

public class Task2_CapitalOne {
    public static void main(String[] args) {
        Task2_Employee obj1=new Task2_Employee("Ali", 23, "QA");
        obj1.setEmployeeAddress("Chicago");
        obj1.setEmployeeID(121);
        obj1.setEmployeeSalary(1405645);
        System.out.println(obj1);
        System.out.println(obj1.getEmployeeSalary());

    }
}
