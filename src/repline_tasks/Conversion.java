package repline_tasks;

import java.util.ArrayList;
import java.util.Arrays;

//import java.util.ArrayList;
public class Conversion {

    public static void main(String[] args) {

       String [] arr1= arr("UserUser");
        System.out.println(Arrays.toString(arr1));
        /*String password="UserUser136";
        String container1="";

        char [] str=password.toCharArray();
        char[] container=password.toCharArray();
        ArrayList<String> negCred=new ArrayList<>();
     //   container=str;
        System.out.println(Arrays.toString(container));
        for (int i=0; i<=container.length-1; i++ ){

            if (container[i]>='a' && container[i]<='z'){
                container[i]= (char) (container[i]-32);
            }
            else if(container[i]>='A' && container[i]<='Z') {container[i] = (char) (container[i] + 32); }
            else {continue;}

            System.out.println("con"+Arrays.toString(container));
            container1=toString(container);
            negCred.add(container1);
//        for (char each:container){
//            System.out.print(""+each);
//            //container1+=""+each;
//        }
           // System.out.println("str"+Arrays.toString(str));
            container[i]=str[i];
         //   System.out.println(container1);
        }
       // System.out.println("last str"+Arrays.toString(str));
        System.out.println(negCred);*/



    }


   //this is a custom class whose function is to convert a char array to a string
    public static String toString(char[] a)
    {
        //simoly convert char to a string. do not forgert String is a custom class
        String string = new String(a);
        return string;
    }

    public static  String [] arr (String password){
       //produce two char arrays from the key word
        char [] str=password.toCharArray();
        char[] container=password.toCharArray();
        //make one array list and a string ready
        ArrayList<String> negCred=new ArrayList<>();
        String container1="";
        for (int i=0; i<=container.length-1; i++ ){
            //ocnvert only the sepecific letter; if it is capital it makes it small; if it is lower case it makes it upper case
            if (container[i]>='a' && container[i]<='z'){
                container[i]= (char) (container[i]-32);
            }
            else if(container[i]>='A' && container[i]<='Z') {container[i] = (char) (container[i] + 32); }
            //if it is not letter, skip the step
            else {continue;}
            container1=toString(container);
            negCred.add(container1);
            container[i]=str[i];
        }

        String [] arr=negCred.toArray(new String[0]);

        return arr;
    }
    //this custom class which produce a variation of string. in each iteration it changes the letter case: capital or small. The return is array


}


















