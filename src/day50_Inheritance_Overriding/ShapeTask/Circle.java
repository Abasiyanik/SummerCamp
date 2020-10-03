package day50_Inheritance_Overriding.ShapeTask;

public class Circle extends Shape{
    /*
    variable:area, periemeter
    method: calcaulteArea, calculatePErimeter
     */

    public double radius;
    public double diameter;
    public static double PI=3.14; // bu static cunku sabit bir deger oldu

    public Circle (double radius){
        this.radius=radius;
        diameter=radius*2;
        area = calculateArea();
        perimeter=calculatePerimeter();
    }

    public double calculateArea(){
        return PI*radius*radius; }

    public double calculatePerimeter(){
        return PI*diameter; }




}
