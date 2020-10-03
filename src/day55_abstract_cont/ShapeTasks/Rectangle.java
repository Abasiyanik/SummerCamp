package day55_abstract_cont.ShapeTasks;

public final class Rectangle extends Shape{

    public double width;
    public double length;

    public Rectangle(double width, double length) {
        if (width<=0 || length<=0){
            throw new RuntimeException("Length and Width cannot be negative or zero");
        }
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return width*length;
    }

    @Override
    public double calculatePerimeter() {
        return (width+length)*2;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    static{
        name = "Rectangle";
        hasVolume = false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }

}
