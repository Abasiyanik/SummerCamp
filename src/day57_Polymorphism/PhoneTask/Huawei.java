package day57_Polymorphism.PhoneTask;

public class Huawei extends Phone implements AndroiadApp, AppleApp, Downloadable {


        public Huawei(String model, String size, double price) {
        super("Huawei", model, size, price);
        if (price>200){
            throw new RuntimeException("no way, cheaper than this, come on");
        }
    }

    @Override
    public void download() {
        System.out.println("Huawei is downloading apps from "+AndroiadApp.AppStoreName+AppleApp.AppStoreName);

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Huawei is texting "+phoneNumber);

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Huawei is calling "+phoneNumber);

    }

    public void stealInfo(){
        System.out.println("Huawei is stealing info ");


    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
