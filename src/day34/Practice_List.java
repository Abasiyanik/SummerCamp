package day34;

import java.util.ArrayList;

public class Practice_List {
    public static void main(String[] args) {
        ArrayList<Integer>oddList=new ArrayList<>();
        ArrayList<Integer>evenList=new ArrayList<>();

        for (int i=0; i<100; i++){
            if (i%2!=0)
            {oddList.add(i);}
            else {evenList.add(i);}

        }
        System.out.println(oddList);
        System.out.println(evenList);
        System.out.println(oddList.size()+" "+evenList.size());// 50 50
        System.out.println(oddList.size()==evenList.size());// true

        System.out.println("=========================");
        ArrayList<String>groceryList=new ArrayList<>();
        groceryList.add("Milk");
        groceryList.add("Apple");
        groceryList.add("Eggs");
        groceryList.add("Mango");
        groceryList.add("Ice Cream");

        System.out.println(groceryList);

        for (int i=groceryList.size()-1;i>=0; i--){
            System.out.print(groceryList.get(i)+"      ");
        }
        System.out.println();
        for (String each:groceryList){// for each loop applicable to ArrayList
            System.out.print(each+"      ");
        }

    }
}
