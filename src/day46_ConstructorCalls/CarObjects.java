package day46_ConstructorCalls;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car("Toyota");

        Car car2=new Car("Toyota", "Prius");

        System.out.println(new Car("BMW", "X5", "white"));

        System.out.println(new Car("Jeep", "Compas", "black", 2010));

        System.out.println(new Car("Honda", "Accord", "Gray", 2011, 3400));

    }
}
