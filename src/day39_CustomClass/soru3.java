package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class soru3 {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.addAll(Arrays.asList(1,2,3,4,5,6,7));
        for (Integer each:a){
            if (each%2!=0){
                continue;

            }
            System.out.println(each+"");
            break;
        }

    }
}
