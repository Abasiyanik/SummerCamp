package day60_collection;

import repline_tasks.number;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
//set does not accept duplicated

        Set <Integer> s1=new HashSet<>();
        s1.addAll(Arrays.asList(8,7,4,3,2,10,7,1, null));
        s1.addAll(Arrays.asList(8,8,8,8,8));// hashset does not accept duplicateds and we will see ordered list of numbers without duplicated number//null, 1, 2, 3, 4, 7, 8, 10

        System.out.println("s1 = " + s1);


        Set <Integer> s2=new LinkedHashSet<>();
        s2.addAll(Arrays.asList(8,7,4,3,2,10,7,1,null));
        s2.addAll(Arrays.asList(8,8,8,8,8));// set does not accept duplicateds

        System.out.println("s2 = " + s2);//ignore dublicated values but not ordered// 8, 7, 4, 3, 2, 10, 1, null// no extra 8 and 7

        Set <Integer> s3=new TreeSet<>();
        s3.addAll(Arrays.asList(8,7,4,3,2,10,7,1));// treeset cannot accept null keyword

        System.out.println("s3 = " + s3); //without duplicated number//1, 2, 3, 4, 7, 8, 10

    }}