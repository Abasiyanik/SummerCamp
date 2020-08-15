package day41_Static;

import java.util.ArrayList;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet []carpets= {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};// carpetlari  array icine alalim
        // carpetlari array haline donustururuz ve degeri artik Carpet olur yani class name icine de
        carpets[0].customOrder(4.5, 3.5, 7.5, false);
        carpets[1].customOrder(5.5, 3.5, 7.5, true);
        carpets[2].customOrder(4.5, 4.5, 7.5, false);
        carpets[3].customOrder(3.5, 3.5, 7.5, true);
        carpets[4].customOrder(4.5, 6.5, 7.5, true);

        for (Carpet each:carpets){
            each.getCarpetInfo();
        }

  //      System.out.println();
        ArrayList<Carpet> persianCarpets=new ArrayList<>();
        ArrayList<Carpet> regularCarpets=new ArrayList<>();
   /*     for (int i=0; i<=carpets.length-1; i++){
            if(carpets[i].isPersian){
                persianCarpets.add(carpets[i]);
            } else{
                regularCarpets.add(carpets[i]);
            }

    */

        for (Carpet each:carpets){

            if (each.isPersian){
                persianCarpets.add(each);
            } else {regularCarpets.add(each);
        }
        }
        System.out.println("Number of persian carpets: "+persianCarpets.size());
        System.out.println("Number of persian carpets: "+regularCarpets.size());

    }
}
