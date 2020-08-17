package day42_Static;

public class ShapeObjects {
    public static void main(String[] args) {
        //if r=25; what is the area
        Circle c1=new Circle();
        c1.setInfo(25);
        //c1.pi=3.14;
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());
        System.out.println(c1);

        Circle.pi=4;
        Circle c2=new Circle();
        c2.setInfo(10);
        System.out.println(c2);
    }
}
