package day50_Inheritance_Overriding.ShapeTask;

public class ShapeObject {
    public static void main(String[] args) {

        Circle circle1=new Circle(3.2);
        System.out.println("=====================");
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculatePerimeter());
        System.out.println("=====================");

        Square square1=new Square(2);
        System.out.println(square1.calculatePerimeter());
        System.out.println(square1.calculateArea());

        System.out.println("=====================");
        Rectangle rect1=new Rectangle(3,4);
        System.out.println(rect1.calculateArea()+ " "+ rect1.calculatePerimeter());
        System.out.println("=====================");


    }
}
