package day47_Encapsulation;

public class Test {
    public static void main(String[] args) {
        //public heryerden accesible ve ayni packagein classindan imporat komutsuz cagrilir
        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

// default AM de public MA gibi heryerden cagrilir ve islenir
        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.defaultMethod();

 //public MAler baska bir class da calismaz mesela bir onceki klassda calisan burada calismayacaktir.

       // System.out.println(AccessModifiers.privateMethod);
      // AccessModifiers.privateVarible; PRIVATE CLASS DISINDA CALISMAZ


      //PRIVATE sadece kendi classinda calisir.
        Encapsulation obj1=new Encapsulation();
//        System.out.println(obj1.ssn);// ssn privare ve bu cagirlamaz. bunu getter ve setter ile yapabiliriz.
        System.out.println(obj1.getSsn());//getter cagrildi


        obj1.setSsn(56434534);
        System.out.println(obj1.getSsn());



    }
}
