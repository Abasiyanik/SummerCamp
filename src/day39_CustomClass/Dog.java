package day39_CustomClass;

import org.w3c.dom.ls.LSOutput;

public class Dog {
    /*
    instance variable
    breeed,size ,age, color

    instance methods:
    setDogInfo
    getDogInfo
    eat
    drink
    sleep
     */
//atribiutes
    String name;
    String breed;
    String size;
    int age;
    String color;

    public void setDogInfo (String dogName, String dogBreed, String dogSize, int dogAge, String dogColor) {//parameters here
        //we have to pass argument, dogs object will call it and 4 argument will be given, string strin int and string
        breed=dogBreed; // tersi mumkun olmaz. atrubutes sohuld be assigned to the argument
        size=dogSize;
        age=dogAge;
        color=dogColor;//attributes are assigned to arguents
        name=dogName;
    }
//set info of the dog
    public void getDogInfo(){
        System.out.println("Name: "+name+
                            ", Breed: "+breed+
                            ", Size :"+size+
                            ", Color :" + color+
                            ", Age :"+age+" years old" );

    }
    //print the dog info



public void eat(String food){
    System.out.println(name+" is eating "+food);
}

public void drink(String drink){
    System.out.println(name+" is drinking " + drink);

}

public void sleep (int sleepTime){
    System.out.println(name+" is sleeping "+sleepTime+"hours per day");
}

public void play(String play){

    System.out.println(name+" is playking with "+play);
}
}