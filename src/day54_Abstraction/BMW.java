package day54_Abstraction;

public class BMW extends Car{
    //burda abstract koyarsak complie error gider ama logical error olur
    //they must have budy
    //we need an implementation
    //use the same method using overriding
    @Override
    public void start (){
        //it cannot be final, static, and private
        System.out.println("pust start buttun");
    }

}
