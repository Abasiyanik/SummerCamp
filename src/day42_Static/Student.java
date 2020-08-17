package day42_Static;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String name;
    int age;
    int groupNumber;
    char gender;

    static String schoolName = "CYbertek School";
    static String favoriteTeacher = "Nadir";

    public void setInfo(String name, int age, int groupNumber, char gender) {
        this.name = name;
        this.age = age;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }
    public String toString(){
        return "School name: "+schoolName+"\nStudent Name: "+name;
        //              statuc variable             instance variable
        //both can be used in an instance method.
    }


    }
class test12{
    public static void main(String[] args) {
        Student [] students={new Student(),new Student(),new Student(),};
        students[0].setInfo("ali", 12, 32, 'F');

        //ArrayList<Student>students=new ArrayList<>();
        //students.sadd(Arrays.as
    }

    }