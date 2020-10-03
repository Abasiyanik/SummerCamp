package day52_Exceptions;

public class Practice1 {
    public static void main(String[] args) {


        int[] arr = {10, 20};

        try {
            System.out.println(arr[20]);
        }
        catch (ArithmeticException e) {
            System.out.println("Artihmetic Expetion is handled");
        }catch (ClassCastException e) {
            System.out.println("Class cas Exetipn");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of ound exeption");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        }
        System.out.println("yo yo ");
        System.out.println("=================================");
        //bunlarin hepsini kullanmaya gerek yok sadece " RuntimeException" veya "Exception" desek sadece yeterli
        //ornek asagida normalde bir unchacked exception var normalde bu specific bir exception var ama grandparent olan
        // Exeption koyduk calisti.
        String str="Cybertek";
        try {
            System.out.println(str.charAt(200));// there is
        } catch (Exception e){
            System.out.println(e.getMessage());//String index out of range: 200
        }

        System.out.println("=================");

        try {
            Thread.sleep(1000);
        } catch (Exception e){// burada bu yeterli gerisine gerek yok anam
            //System.out.println(e.getMessage());
        }

        System.out.println("=================");

    }
}