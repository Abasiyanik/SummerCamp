package day37_CollectionType;

//import org.w3c.dom.ls.LSOutput;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfCharachter {
    public static void main(String[] args) {
        String str="AABBCC";
        ArrayList<String> list=new ArrayList<>();
        for (String each:str.split("")){
            list.add(each);
        }
        System.out.println(list);//[A, A, B, B, C, C]
/*
   int count= Collections.frequency(list, "A");
        System.out.println("A :"+count);//lets make it by using loops
  */
        String nonDup= Util.removeDup(str); // str daki dublice olmus olan stringler remove edilir

      //for(String each: list) {
        for (String each: nonDup.split("")){
          int count = Collections.frequency(list, each);
          System.out.print(each + count);
      }

      }}
