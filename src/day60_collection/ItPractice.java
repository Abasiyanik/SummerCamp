package day60_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ItPractice {
    public static void main(String[] args) {
         String [] arr={"Ahmed", "Aalia", "Abzla", "Ahmed", "Virginia", "Ahmed", "Ahmed"};

        ArrayList<String> names=new ArrayList<>(Arrays.asList(arr));

        Iterator<String> it=names.iterator();

        while (it.hasNext()){
                if (it.next().equals("Ahmed")){
                    it.remove();

                }

        }
        System.out.println(names);

    }
}
