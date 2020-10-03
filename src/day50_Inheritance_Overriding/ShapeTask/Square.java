package day50_Inheritance_Overriding.ShapeTask;

public class Square extends Shape{
    public double width;
    //public double length;

    public Square (double width){
        this.width=width;
       area=calculateArea();
        perimeter=calculatePerimeter();

    }

    public double calculateArea(){
        return width*width;
    }

    public double calculatePerimeter(){
        return 4*width;
    }


}
