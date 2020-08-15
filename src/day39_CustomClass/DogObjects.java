package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {


    Dog dog1=new Dog();
    Dog dog2=new Dog();
    Dog dog3=new Dog();//now objects are created.
    // hadi verelim
    //costum class instance objectler icin kullanilmaz
    dog1.setDogInfo("Karabas", "Beagle","medium", 2,"Mix");
    dog2.setDogInfo("Roofus", "Argantinian Dogo", "Large", 3,"White");
    dog3.setDogInfo("Winston", "Scotties Terrier", "Small", 1, "Black");

    dog1.getDogInfo();
    dog2.getDogInfo();
    dog3.getDogInfo();

    dog1.eat("Kelle paca");
    dog3.eat("Steak");
    dog2.eat("sopa");

    dog1.drink("cole");
    dog2.drink("salgam");
    dog3.drink("zikkim");

    dog1.sleep(7);
    dog2.sleep(8
    );
    dog3.sleep(10);

}}
