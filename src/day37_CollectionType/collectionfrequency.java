package day37_CollectionType;

import java.util.ArrayList;
import java.util.Collections;
///AMAC: UNIQUE OLAN KARAKTERI BUL

public class collectionfrequency {
    public static void main(String[] args) {
        String str="AABBCDDEEF";
        String unique="";
        ArrayList<String> list=new ArrayList<>();
        for (String each: str.split("")){
            list.add (each);
        }
        System.out.println(list);

        for (String each:list){

            //int count= Collections.frequency(list,"A");
            int count= Collections.frequency(list, each); // EN ONEMLI COMMENT
            //System.out.println(count);

            if (count==1){
            //System.out.println(each); }
                unique+=each;//unique ekler
        }}
        System.out.println(unique);

}}
