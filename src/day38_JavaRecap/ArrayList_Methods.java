package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Mercedes", "Infinity", "Tesla", "WV", "Lamborghini", "Lexus"));

        System.out.println(cars);
        //remove iki turlu olur: birinci index number a gore digeri ise objectin kendine gore

        cars.remove(2);
        System.out.println(cars);
        //burada ise objectin kendisi yani "Tesla" girilerek remove edilir
        cars.remove ("Tesla");

        System.out.println(cars);
        //eger birden fazla remove yapmak icin removeAll kullanilir
        //mesela
        ArrayList<String> cars2=new ArrayList<>();
        cars2.addAll(Arrays.asList("BMW", "Mercedes", "Infinity", "Tesla", "WV", "Lamborghini", "Tesle", "Lexus", "Tesla"));
        cars2.remove ("Tesla");
        System.out.println(cars2);//hala ikinci tesla vardir //BMW, Mercedes, Infinity,  WV, Lamborghini, Tesle, Lexus, Tesla
        //tum hepsini silmek icin
        cars2.removeAll(Arrays.asList("Tesla")); // bu tum Teslalari siler
        // burda removeAll bir bulk operation ve collection type ister dolayisiyla STring kullanamayiz bir string kullanmak icin mutlaka Arrays..asList gerekir

        System.out.println(cars2);//BMW, Mercedes, Infinity, WV, Lamborghini, Tesle, Lexus]
        System.out.println("================================");
        ArrayList<String> cars3=new ArrayList<>();
        cars3.addAll(Arrays.asList("BMW", "Mercedes", "Infinity", "Tesla", "WV", "Lamborghini", "Tesle", "Lexus", "Tesla"));
        //removeif ile condition uretecegiz
        //REMOVEALL
        cars3.removeIf(p-> p.toLowerCase().contains("m"));
        System.out.println(cars3);//Infinity, Tesla, WV, Tesle, Lexus, Tesla

        //RETAINALL : remove all NOT  matching elemants
        //yani condition icerenler kalir digerleri gider
        //retainAll da bulk operation ve sonucta Arrays.asList kullanilmaldir

        ArrayList<String> cars4=new ArrayList<>();
        cars4.addAll(Arrays.asList("BMW", "Mercedes", "Infinity", "Tesla", "WV", "Lamborghini", "Tesle", "Lexus", "Tesla"));
        System.out.println("=========================");
        cars4.retainAll(Arrays.asList("WV", "Lexus"));
        System.out.println(cars4);// WV Lexus

        System.out.println("=============================================");

        ArrayList<String>groceryList=new ArrayList<>();

        groceryList.addAll(Arrays.asList("Eggs", "Milk", "Paper Towels", "Toilet Papers", "Mango", "Orange", "Avocado",
                "Dragon Fruit"));
        System.out.println(groceryList);
        // how can i check already pepsi i bougt==> contains method used
        //boolean a=groceryList.contains(Arrays.asList("Pepsi"));// bu da olur
        boolean r1=groceryList.contains("Pepsi");// bulk operation olmadigi icin bu sekilde
        System.out.println(r1);

        //eger birden fazla items varmi yokmu anlamak istersek ne yapacaguz
        System.out.println("==============================");
        //containsAll method luuanikir

        boolean r2=groceryList.containsAll(Arrays.asList("Eggs", "Orange", "Milk"));// bir sonuc verir biri yoksa bile false verir
        System.out.println(r2);// true
        boolean r3=groceryList.containsAll(Arrays.asList("Eggs", "Orange", "Milk", "Water"));// bir sonuc verir biri yoksa bile false verir
        System.out.println(r3);// false zira water yok
        System.out.println("==============================");
        //size method
        System.out.println("Total number of items: "+ groceryList.size());

        System.out.println("==============================");
        // set : birini alir ve yerine baska birey koyar

        //dragon fruit yerine apple istiyoruz ve degistiriyoruz

        groceryList.set(groceryList.size()-1,"Apple");// set(index number of the item we change, the new item)
        System.out.println(groceryList);//Eggs, Milk, Paper Towels, Toilet PApers, Mango, Orange, Avocado, Apple

        System.out.println("==============================");

        //diyelim ki index numberini bilmiyoruz ve degistirmek istiyoruz
        // paper towel ile baska birseyi degistirmek istiyoruz
        //indexoff kullanilir
        groceryList.set(groceryList.indexOf("Paper Towels"), "Dish Washer");
        System.out.println(groceryList);

        groceryList.clear();
        System.out.println(groceryList+"clred");// hepsini temizler






    }
}
