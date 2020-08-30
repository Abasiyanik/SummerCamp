package Library;
import day47_Encapsulation.AccessModifiers;
public class TestAccessModifiers {

    public static void main(String[] args) {
        //day47 deki public access modifier baska bir paket olan Libraryden cagriablirdi import ile bareber
        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();


        //System.out.println(AccessModifiers.defaultVariable); day47 deki default variable burada ise yaramadi ve kullinalimadi
        //AccessModifiers.defaultMethod;  // ne yazik ki default method buradan cagrilamadi
    }


}
