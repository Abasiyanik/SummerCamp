package day39_CustomClass;

import java.util.ArrayList;

public class soru2 {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("ali");
        name.add("ali");
        if (name.remove("ali")){
            name.remove("veli");

        }
        System.out.println(name);
    }
}
