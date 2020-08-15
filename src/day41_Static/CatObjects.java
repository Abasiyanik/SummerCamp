package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {

    Cat cat1=new Cat();
    cat1.setCatInfo1("bala", 6, 'F', "blue", "persian");
        System.out.println(cat1);//Name: bala, Breed: persian, Color: blue
        //yukarda otomatik olarak tostring calisir ve belirledigimiz return olarak yazilir
     Cat [] catPark= { cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};
     catPark[5].setCatInfo1("tabitabi", 9,'F', "brown","ordinary");
        catPark[1].setCatInfo1("Ruby", 3, 'F', "Red", "Persian");
        catPark[2].setCatInfo1("Sam", 2, 'M', "Grey", "Sphynx");
        catPark[3].setCatInfo1("Judy", 1, 'F', "Brown", "Bengal");
        catPark[4].setCatInfo1("Tom", 6, 'M', "Grey", "American Shorthair");
        //cat[5].setInfoCat("Lord", 8, 'M', "White", "Maine Coon");
        for (Cat each:catPark){
            System.out.println(each);// onceki de bilgi var ama digerlerinde defaoult veri atanmis oluyor
        }
        System.out.println(Arrays.toString(catPark)+"n/");// burda yanyana yazilir anlasilmaz
//to arraylist of cat: female and male
        ArrayList<Cat> maleCat=new ArrayList<>();
        ArrayList<Cat>femaleCat =new ArrayList<>();

        //hepsini ona ekleyim addALL la sonra removeif yapacagiz
        for (Cat each:catPark){

            if (each.gender=='M'){
                maleCat.add(each);
            } else {femaleCat.add(each);
            }
        }
        System.out.println("=====================");
        System.out.println(maleCat);

        for (Cat each:femaleCat){
            System.out.println(each);
        }
        //regularCarpets.removeAll(persianCarpets);// burda persianCarpetda olan hepsi silinir.
    }}
