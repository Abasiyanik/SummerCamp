package day42_Static;

public class Circle {
    double radius;
    double diameter;
    static double pi=3.14;
    //these are the attribiutes given to the circle

    public void setInfo (double radius){
        this.radius=radius;
        diameter=radius*2;
    }
    public double calcArea (){
        return radius*radius*pi;
    }
    public double calcPerimeter(){
        return diameter*pi;
        }
    public String toString (){
        return "Circumstances of the circle with a radius of "+radius+" is "+calcPerimeter()+", and its area is "+calcArea()+"/n pi:"+pi;

    }

}
