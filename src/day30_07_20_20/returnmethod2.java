package day30_07_20_20;

//import com.sun.jdi.connect.ListeningConnector;

public class returnmethod2 {
    public static void main(String[] args) {
        String name="Level";
       // System.out.println(revStr1(name));

        String reversedName=revStr2(name);
        if (name.equalsIgnoreCase(revStr2(name))){//revStr2 void kullandigimiz icin
         System.out.println("palandromuc");
        } else {
           System.out.println("not");

    }}
    public static void revStr1(String str) {
        String result ="";
        for (int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);

        }
       //System.out.println(result);
       // return result;


    }
    public static String revStr2(String str1) {
        String result ="";
        for (int i=str1.length()-1; i>=0; i--){
            result+=str1.charAt(i);

        }
        //System.out.println(result);
        return result;


    }
}
