package day54_Abstraction;

import day47_Encapsulation.Test;

public class ParkingLot {
    public static void main(String[] args) {
    //can i creat the obj of car class : no
        //it is not concrete os we can not
        BMW car1=new BMW();
       Jeep car2=new Jeep();
        Toyota car3=new Toyota();
        Tesla car4= new Tesla();
        Car [] cars={car1, car2, car3, car4};
        for (Car each:cars){
            each.start();
        }

    }
}
