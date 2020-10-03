package day46_ConstructorCalls;

public class ConstructorCalls3 {
public ConstructorCalls3 (){
    System.out.println("X");

}
public ConstructorCalls3(int a){
    this();
    System.out.println("Y");


}

public ConstructorCalls3(double a){
    this(3);
    //this(): // BIRDEN FAZLA CONSTRCUTOR KULLANILABMAZ.
    System.out.println("Z");

}


public void method1(){
    //ConstructorCalls3(); // cenot be called by name
    //this(); ?? con be only in a contrcutor
}


}
