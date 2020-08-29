package day44_Constructor;

import java.util.ArrayList;

public class BankOfAzarbaijan {
    public static void main(String[] args) {
        ArrayList<Employee> list =new ArrayList<>();
        list.add(HumanResource.employee1);// class name kullanilarak veriable cagrilabliir
        list.add(HumanResource.employee3);
        list.add(HumanResource.employee5);
        //kolay yolu var. oda

        System.out.println("totla numbr"+ list.size());

        System.out.println("===========================");

        for (Employee each:list){
            System.out.println((each.salary+" : "+each.salary));
        }

    }
}
