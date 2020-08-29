package day45Constructorcap;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    /*
    create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list

     */
    public static void main(String[] args) {
        Item item1 = new Item("Apple", 1.5, 3);
        Item item2 = new Item("Bread 1Lb", 0.97, 5);
        Item item3 = new Item("Manchego Cheese 1.75Lb",9.89, 2);
        Item item4 = new Item("Garbanzo Beans 15.5oz", 0.88,5);
        Item item5 = new Item("Almonds milk 1/2 Gallon",1.79,2);

        ArrayList<Item> list=new ArrayList<>();
        list.addAll(Arrays.asList(item1, item2, item3, item4, item5));
        System.out.println(item1);

        System.out.println("items: "+list.size());

        double totalCost=0;
        for (Item each : list){
            totalCost+=each.calcCost();
         //   System.out.println(each.calcCost());

        }

        System.out.println("total price: " +totalCost);
        System.out.println("==================================");
        //bunlari array halinde de gosterebiliriz
        Item [] items={item1, item2, item3, item4, item5};
        double totalCost2=0;
        for (int i=0; i<=items.length-1; i++){
            totalCost2+=items[i].calcCost();
           // System.out.println(items[i].calcCost());
            //System.out.println(totalCost2);

        }
        System.out.println(" total cost 2:  "+totalCost2);





    }
}
