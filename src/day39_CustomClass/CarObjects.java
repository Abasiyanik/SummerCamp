package day39_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car();
/*
                car1.brand = "Toyota";
                car1.model="Corolla";
                car1.color="White";
                car1.year=2020;
                car1.milage=20000;
                car1.price=19000.50;
 */
        car1.setCarInfo("Toyota", "Corolla", 2020, "White", 20000,19000.50);
        //bu sadece car1 i baglar car2 ile herhangi bir alisverisi olmaz. instance dir. dolaiyislya sadece car1 info verilir

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.milage);
        System.out.println(car1.color);
        System.out.println(car1.price);


        System.out.println("======================================");
        Car car2=new Car();
/*
                car2.brand = "Mercedes";
                car2.model="G 550";
                car2.color="Blue";
                car2.year=2000;


 */
        car2.setCarInfo("BMW", "X5", 2010, "Black", 500000,40000);

//                car2.milage=20000;
//                car2.price=19000.50;


        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.milage);
        System.out.println(car2.color);
        System.out.println(car2.price);

        Car car3=new Car();
        car3.setCarInfo("Toyota", "Corolla", 2010, "Green", 150000,4000);
        System.out.println(car3.brand);
        System.out.println(car3.model);
        System.out.println(car3.year);
        System.out.println(car3.milage);
        System.out.println(car3.color);
        System.out.println(car3.price);
        System.out.println("=======================");
        Car car4=new Car();
        car4.setCarInfo("Toyota", "Prius", 2004, "Light Green", 140000,1400);
        System.out.println(car4.brand);
        System.out.println(car4.model);
        System.out.println(car4.year);
        System.out.println(car4.milage);
        System.out.println(car4.color);
        System.out.println(car4.price);
    }
}
