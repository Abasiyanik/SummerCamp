package day57_Polymorphism.PhoneTask;

public class Iphone extends Phone implements AppleApp, Downloadable{// compile error verdi override yapmadi
    //ikinci superclass no arguent ne apalim


    public Iphone( String model, String size, double price) {
        super("Iphone", model, size, price);//burada brand istedi ama sildik ve Iphone ekledik zira ihone a gerekyok

        //burda 4 instanc evariable .
        if (price>1500){
            throw new RuntimeException("too expensive and cannot be greater than 1.5K");
        }
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iphone is texting"+phoneNumber);

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("ihpone is calling "+ phoneNumber);

    }

    @Override
    public void download() {
        System.out.println("ipone is downlaoding app form "+AppStoreName);

    }
    public void faceTime(long phoneNumber){
        System.out.println("iphone is facetiming " +phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
