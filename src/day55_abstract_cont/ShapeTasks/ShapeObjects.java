package day55_abstract_cont.ShapeTasks;

import java.util.List;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle obj1=new Circle(4.0);
        System.out.println(obj1);
        Rectangle obj2=new Rectangle(3,3);
        Cylinder obj3=new Cylinder(3,4);
        Circle circle1 = new Circle(2.5);

        System.out.println(circle1);
        System.out.println("Circle Has Volume: "+ Circle.hasVolume);

        Circle circle2 = new Circle(5.5);
        System.out.println(circle2);

        System.out.println("=======================================");

        Rectangle rectangle1 = new Rectangle(10, 5);
        System.out.println(rectangle1);

        System.out.println( new Rectangle(20, 30) );

        System.out.println("========================================");

        Cylinder cylinder1 = new Cylinder(5, 10);
        System.out.println(cylinder1);

        System.out.println(circle1.hasVolume);
        System.out.println("================================");
//        Circle circl3=new Circle(-10);
//        System.out.println(circl3);
//        Rectangle rectangle 2=new Rectangle((-2, 0);
//        Cylinder cylincer2=new Cylinder (0,0);


        System.out.println("=========================");
    }
}
