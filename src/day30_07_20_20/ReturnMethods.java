package day30_07_20_20;

public class ReturnMethods {
    public static void main(String[] args) {
        addition1(3,4);//bu veri hicbir sekilde tekrar kullanilmasz
        // sonuc 7 dir ve hic bir sekilde kimse kullanamaz bir veriye atanamaz
        //addition1(3,4)*3; seklinde kullanilmaz
        int sum =addition2(100,200);// sum olarak 100 atanir.
        System.out.println(sum);
        System.out.println(addition2(30,5));// bu sekilde sumi heryerde kullanabiliriz. SUUUUUUPER


    }


    public static void addition1 (int a, int b){//void oldugu icin veriler baska yerde kullanilmaz

        int sum=a+b;
        System.out.println(sum);
    }

    public static int addition2(int a, int b){// burada int olunca mutlaka
      //  return 100;
       int sum= a+b;
       return sum;



    }


}
