package day47_Encapsulation;


public class AccessModifiers {
    //public access modifier: visible everywhere
    //default AM is visible only in the same package, ourside the package default is not accesible

    //public:
    public static int publicVariable=100;
    public static void publicMethod(){  System.out.println("public method");  }


    //default:
    static int defaultVariable=123;
    static void defaultMethod(){ System.out.println("default method");  }

    //private
    private static int privateVariable=300; //
    private static void privateMetohd(){
        System.out.println("private method");

    //hepsinde static as a specifier kullandik ki static heryerde gecsin yoksa instance olur
    }

    public static void main(String[] args) {

        //wtihinde method public, default ve private hepsi de cagrilabilir yoksa cgrilamaz
        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);

        publicMethod();
        defaultMethod();
        privateMetohd();

    }
}
