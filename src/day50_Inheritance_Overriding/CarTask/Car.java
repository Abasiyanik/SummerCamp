package day50_Inheritance_Overriding.CarTask;

public class Car {
    /*
    burdaki amaca araclarin start methodunun farkli arabalardaki implementation gosterilecek overrideen metodla
    car bir paretn class ve honda mercedes vb child olacak ama  hepsinde ayni method farli is yapacaklar ki
    buna OVERRIDING METHOD deniliyor
     */

    public void start(){
        System.out.println("Insert the key");
        System.out.println("twist ignitiion key to start");
    }
}
