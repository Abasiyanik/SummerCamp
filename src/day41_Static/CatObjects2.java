package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {
    public static void main(String[] args) {
        Cat cat1=new Cat();

        Cat [] catPark= { new Cat(), new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};
        catPark[5].setCatInfo1("tabitabi", 9,'F', "brown","ordinary");
        catPark[1].setCatInfo1("Ruby", 3, 'F', "Red", "Persian");
        catPark[2].setCatInfo1("Sam", 2, 'M', "Grey", "Sphynx");
        catPark[3].setCatInfo1("Judy", 1, 'F', "Brown", "Bengal");
        catPark[4].setCatInfo1("Tom", 6, 'M', "Grey", "American Shorthair");
        catPark[0].setCatInfo1("bala", 6, 'F', "blue", "persian");

        ArrayList<Cat> maleCat=new ArrayList<>();
        ArrayList<Cat>femaleCat =new ArrayList<>();

        //add all and removeif

        femaleCat.addAll(Arrays.asList(catPark));
        femaleCat.removeIf(p->p.gender=='M');

        maleCat.addAll(Arrays.asList(catPark));
        maleCat.removeAll(femaleCat);
        for (Cat each:maleCat){
            System.out.println(each);}
        System.out.println("==========================");
        for (Cat each:femaleCat){
            System.out.println(each);}
    }
}
