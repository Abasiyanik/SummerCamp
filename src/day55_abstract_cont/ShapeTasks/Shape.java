package day55_abstract_cont.ShapeTasks;
//1. create an abstract class called Shape
//            attributes:
//                name(static), area, perimeter, hasVolume(static), volume
//            abstract methods: calculateArea(), calculatePerimeter(), calculateVolume()
//                                return-types: double
public abstract class Shape {
    public static String name;
    public double area;//her object farkili area olur
    public double perimeter;
    public static boolean hasVolume;//hepsi false oldugu icin static yeterli
    public double volume;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();





}
