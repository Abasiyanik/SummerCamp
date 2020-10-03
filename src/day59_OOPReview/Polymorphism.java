package day59_OOPReview;

import day55_abstract_cont.ShapeTasks.Circle;
import day55_abstract_cont.ShapeTasks.Rectangle;
import day55_abstract_cont.ShapeTasks.Shape;

public class Polymorphism {
    public static void main(String[] args) {

        Shape shape1=new Circle(3);

        System.out.println(shape1.calculateArea());
       // System.out.println(shape1.radius);//radius bu sekilde cagrilamaz downcasting lazim
        System.out.println( ((Circle)shape1).radius);//radius bu sekilde cagrilamaz downcasting lazim

        //System.out.println( ((Rectangle)shape1).length);//compile error gormex ama exception belirir

        Rectangle r1=new Rectangle(3, 5);

        Shape shape2=r1; //upcasting


    }
}
