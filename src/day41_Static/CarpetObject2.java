package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject2 {
    public static void main(String[] args) {


        Carpet []carpets= {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};// carpetlari  array icine alalim
        // carpetlari array haline donustururuz ve degeri artik Carpet olur yani class name icine de
        carpets[0].customOrder(4.5, 3.5, 7.5, false);
        carpets[1].customOrder(5.5, 3.5, 7.5, true);
        carpets[2].customOrder(4.5, 4.5, 7.5, false);
        carpets[3].customOrder(3.5, 3.5, 7.5, true);
        carpets[4].customOrder(4.5, 6.5, 7.5, true);

        for (Carpet each:carpets){each.getCarpetInfo();}

        //      System.out.println();
        ArrayList<Carpet> persianCarpets=new ArrayList<>();
        ArrayList<Carpet> regularCarpets=new ArrayList<>();

        //hepsini ona ekleyim addALL la sonra removeif yapacagiz
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(p-> ! p.isPersian);// bu boyle de yapilabilr

        regularCarpets.addAll(Arrays.asList(carpets));
        //regularCarpets.removeIf(p-> p.isPersian);
        regularCarpets.removeAll(persianCarpets);// burda persianCarpetda olan hepsi silinir.



        System.out.println("Number of persian carpets: "+persianCarpets.size());
        System.out.println("Number of regular carpets: "+regularCarpets.size());
        for (Carpet each: persianCarpets){ each.getCarpetInfo();}
    }

}
