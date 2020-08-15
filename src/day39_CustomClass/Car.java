package day39_CustomClass;

public class Car {
/*
Attribiutes: model, brand, yerar ,color, milage, VIN ....

different copies of each attriubes
instance varialbe are delcared outside method
 */

    //COSTUM CLASS
    //ATTRIBUTES (INSTANCE VALUES)
    String brand;       // cannot assign thisto a variable
    String model;
    int year;
    String color;
    double milage;
    double price;

    public void setCarInfo(String carBrand, String carModel,
                        int carYear, String carColor, double carMilage,double carPrice){//how can i assign carBrand to brand
        //instance method larda static olamaz.
        //staticlerde yukaridaki brand i kullanamayiz
        //dolayisiyla static kaldirilir
        //instance measns each object has its won copies
        //static olsa bu sadece bir copy olacakti .dolayisiyla her object kendi kopyasi olmasi icin insatance yok edildi
        brand=carBrand;
        model=carModel;
        year=carYear;
        color=carColor;
        price=carPrice;
        milage=carMilage;
        //what is the functionallity of this?
    }
    //public void getCarInfo(){// aim is to print all these variables
    public void getCarInfo(){
        System.out.println(year +" "+brand+" "+model+", "+ color+", "+milage+", $"+price);
    }
    public void start(){
        System.out.println(brand+" "+model+" is started");
    }


    }




