package day54_Abstraction;
/*
OOP:
    1. Encapsulation: hiding the data
    2. Inheritance: sub/super class, IS A
    3. Abstraction
    4. Polymophism
3. OOP Abstraction: hiding the implementation details of method
                ONLY concentrating on essentials/important things, without worrying about the details
                we only know what it does, but we dont know how it's done
Ex1:
    shape: not concerete ==> abstract
        area();
    circle:
        area():
            r*r*PI
    square
        area():
            a*a
    rectangle
        area():
            w*l
Ex2:

    Car: abstract
        start();
    BMW
        start(): push start button
    Tesla
        start(): voice control
    Toyota
        start(): Insert the key
    Jeep
        start(): jump start
1. abstract method: a method without implementation (does not have body)
                    meant to be overriden ( CANNOT BE final, static, private)
            Access-Modifier  abstract  Return_type   methodName(Parameter);
            (none private)    MUST      MUST
            public abstract double area();

 */
public abstract class Car {
    public abstract void start();

}
