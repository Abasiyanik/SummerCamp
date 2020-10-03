package day58_Polymorphism;

import day55_abstract_cont.ShapeTasks.*;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class InstanceOf_Keyword {

    public static void main(String[] args) {

        Animal animal1=new Animal (10,'F');
        Animal animal2=new Dog ("Winston",4, 'M');
        Animal animal3=new Cat ("Kiko",2, 'M');
        //Verify animal3 is the object of Animal clss
        boolean r1=animal3 instanceof Animal;
        boolean r2=animal3 instanceof Dog;
        boolean r3=animal3 instanceof Cat;
        System.out.println("r1:"+r1+", "+"r2:"+r2+", "+"r3:"+r3+", ");

        boolean r4=animal2 instanceof Animal;//true
        System.out.println("r4= "+r4);
        System.out.println(animal2 instanceof Dog);

        System.out.println("==================");

        Shape shape1=new Circle(3);
        Shape shape4=new Circle(4);
        identifyShape(shape1);
        Shape shape2=new Rectangle(2,3);
        Shape shape3=new Rectangle(2,3);
        Shape shape5=new Cylinder(2,3);
        Shape shape6=new Cylinder(2,2);

        IdentifyShape(shape3,shape2);
        IdentifyShape(shape5,shape6);
        IdentifyShape(shape1, shape4);



    }

    public static void identifyShape (Shape shape){
        if (shape instanceof Circle)
            System.out.println("circle");
            else if (shape instanceof Cylinder)
            System.out.println("cylinder");
            else System.out.println("rectangular");


        }
public static void IdentifyShape (Shape shape1, Shape shape2){


String shapeOne=(shape1 instanceof Circle)? "Circle" : (shape1 instanceof Rectangle)? "Rectangle": (shape1 instanceof Cylinder)? "Cylinder": "none";
String shapeTwo=(shape2 instanceof Circle)? "Circle" : (shape2 instanceof Rectangle)? "Rectangle": (shape2 instanceof Cylinder)? "Cylinder": "none";

String result="";

    if (!shapeOne.equals(shapeTwo)){ throw new RuntimeException("Shapes are not equal"); }

    switch(shapeOne){
     case "Circle":
       if (((Circle) shape1).radius==((Circle) shape2).radius)
           {System.out.println("they are "+shapeOne+" and their size is equal");} else {throw new RuntimeException("they are "+ shapeOne+" but their size are different");};
       break;
    case "Rectangle":
        if (((Rectangle) shape1).width==((Rectangle) shape2).width && ((Rectangle) shape1).length==((Rectangle) shape2).length)
        {System.out.println("they are "+shapeOne+" and their size is equal");} else {throw new RuntimeException("they are "+ shapeOne+" but their size are different");};
        break;
    case "Cylinder":
        if (((Cylinder) shape1).height==((Cylinder) shape2).height && ((Cylinder) shape1).radius==((Cylinder) shape2).radius)
        {System.out.println("they are "+shapeOne+" and their size is equal");} else {throw new RuntimeException("they are "+ shapeOne+" but their size are different");};
        break;

    default:
        throw new IllegalStateException("Unexpected value: " + shapeOne);
}
}

    }

