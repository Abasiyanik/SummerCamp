package day45Constructorcap;

public class PayCheck {
    public static void main(String[] args) {
        SalaryCalculator obj1 = new SalaryCalculator(55, 40, 0.09, 0.24);

        System.out.println( obj1.salary() );
        System.out.println("Salary After Tax per month: "+obj1.salaryAfterTax()/12);
        System.out.println("Total Tax: "+   (obj1.salary() - obj1.salaryAfterTax( ) ));


        System.out.println(obj1);
    }
}
