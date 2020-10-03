package day51_Exceptions;
class X{
    public X(){
        System.out.println("X");
    }

}
class Y extends X{
    public Y(){
        System.out.println("Y");
    }

}
class Z extends Y{
    public Z(){
        System.out.println("Z");
    }

}


public class Practice {
    public static void main(String[] args) {
        X as=new X();// sadece X print edilir
        System.out.println("===================");
        Y as1=new Y();// x ve y print edilir
        System.out.println("===================");
        Z as2=new Z();// x ve y print edilir
        System.out.println("===================");

    }
}
