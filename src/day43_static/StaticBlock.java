package day43_static;

public class StaticBlock {
    /*
    normalde main sadece exectuion olurdi ama static block olunca buda execute olur

     */


    public static void main(String[] args) {
        System.out.println("Mani method");
    }
    static {// her zaan statik block once yazilir
        System.out.println("Static block");
    }

}
