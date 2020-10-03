package day53_CustomException_Final;

public class T2_InvalidBrowserNameException extends RuntimeException{

    public T2_InvalidBrowserNameException(String args){
        super("Invalid Browser Name and "+args);
        System.err.println("are you kidding");// err rengini de kirmizi yapar
        //System.out.println("T2_InvalidBrowserNameException.T2_InvalidBrowserNameException");
    }

}
class Test2{

    public static void main(String[] args) {
        String name="bacth20";
        System.out.println();
        switch (name){
            case "chrome":
                System.out.println("Chrome is selected");
                break;
            case "firefox":
                 System.out.println("Fire fox is selected");
                 break;
            case "safari":
                System.out.println("Safari is selected");
                break;
             //if an invalid browser name verilirse, in tahat case ne yapmali uyari verip durdurmali
            default:
                throw new T2_InvalidBrowserNameException("PLEASE ENTER A VALID BROWSER NAME");
                //throw new T2_InvalidBrowserNameException("PLEASE ENTER A VALID BROWSER NAME");

        }
        //SONUC:Exception in thread "main" day53_CustomException_Final.T2_InvalidBrowserNameException: Invalid Browser Name
        // VE SONUC BILINIR


        //throw new T2_InvalidBrowserNameException();

    }

}
