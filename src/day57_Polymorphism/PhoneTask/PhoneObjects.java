package day57_Polymorphism.PhoneTask;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone iphone1=new Iphone("12", "5.3", 1000);
        Samsung smg1=new Samsung("S20","6.1", 890);
        Huawei huawei1=new Huawei("robery", "5.3", 25);

        System.out.println(iphone1);
        System.out.println(smg1);
        System.out.println(huawei1);
        iphone1.texting(343535);
        Phone iphone2=new Iphone("23", "6.7",345);
        System.out.println(iphone2);
        Phone smg2=new Samsung("S8", "6.5", 900);
        Phone huaweii2=new Huawei("sada","3", 35);

//        bunlari array yapalim
        //Iphone [] ph={iphone1, iphone2};iphone2 yi kabul etmez zira Phone ile basladi ve hicbirini digerini almaz
//        Samsung []  ph={...} // bunlarinda almaz
        Phone[] phones={iphone1, smg1, huawei1, iphone2, smg2, huaweii2};// bu polymorphisimden dolayi mumkun
        //yoksa mumkun olmayacakti




    }
}
