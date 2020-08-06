package day26_7_14;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
/*
2. write a program that can return the number of appearances of “java” and “python” anywhere in the sentence
            ex:
                input: I love Java, Python is cool
                output: 1 Java 1 Python
                input: Java Java Python Python Python
                output: 2 Java 3 Python

 */
public class countwords {
    public static void main(String[] args) {


        String sentence = "I love Java , Phyton is cool java";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int countJava=0;
        int countPhyton=0;

        for (String a:words){

            if (a.toLowerCase().contains("java")) {
            countJava++;
            continue;
            } else if (a.toLowerCase().contains("phyton")){
                countPhyton++;
                continue;
            }
            continue;
            }
        System.out.println(countJava);
        System.out.println(countPhyton);




        }


    }
