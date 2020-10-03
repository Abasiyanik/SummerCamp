package Library;
import java.util.ArrayList;
import java.util.Arrays;

public class Util {
    public static String removeDup(String str){
        String nonDup = "";

        for( String each : str.split("") ){
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }

        return nonDup;
    }
    // removes the duplicates and returns the value repline_tasks.string

    public static String reverse(String str){
        String result = "";
        for(int i = str.length()-1;  i >=0 ; i--){
            result += str.charAt(i);
        }
        return result;
    }
    // repline_tasks.reverse the repline_tasks.string and retunr the value

    public static int frequency(String str, char ch){
        int count = 0;
        for(char each  : str.toCharArray() ){
            if(each == ch){
                count++;
            }
        }

        return count;
    }
    //  finds the frequency of char from repline_tasks.string str and returns it as int

    public static String uniques(String str){
        String uniques = "";

        for(char each  : str.toCharArray() ){
            int count =frequency(str, each);  // frequency of every character
            if(count == 1){
                uniques += each;
            }
        }

        return uniques;
    }
    // retunrs the uniiques from the repline_tasks.string

    public static String frequencyOfChars(String str){

        String expectedResult = "";
        String nonDup =    Util.removeDup(str);

        for(char each : nonDup.toCharArray() ){
            int count1 = Util.frequency(str, each);
            expectedResult +=   ""+ each + count1;
        }

        return expectedResult;
    }
    // returns the frequency of every single characters from a repline_tasks.string

    public static  String  formatFullName(String first , String last){
        first = first.substring(0, 1).toUpperCase() +  first.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = first + " " +last;

        return fullName;
    }
    // formats the full name





    public static int maxNum(int[] arr){
        int max = arr[0];

        for( int each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    // find and returns the max number from int array

    public static Integer maxNum(Integer[] arr){
        Integer max = arr[0];

        for( Integer each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    // find and returns the max number from Integer array

    public static double maxNum(double[] arr){
        double max = arr[0];

        for( double each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    // find and returns the max number from double array

    public static Double maxNum(Double[] arr){
        Double max = arr[0];

        for( Double each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    // find and returns the max number from Double array


    public static int minNum(int[] arr){
        int min= arr[0];

        for( int each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    // find and returns the min number from int array

    public static double minNum(double[] arr){
        double min= arr[0];

        for( double each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    // find and returns the min number from double array

    public static Integer minNum(Integer[] arr){
        Integer min= arr[0];

        for( Integer each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    // find and returns the min number from double array

    public static Double minNum(Double[] arr){
        Double min= arr[0];

        for( Double each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    // find and returns the min number from double array


    public static int[] addElement(int[] arr, int element){
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1] = element;

        int i =0;
        for(int each: arr){
            arr2[i]  = each;
            i++;
        }

        return arr2;
    }
    // inserts the element to the array

    public static double[] addElement(double[] arr, double element){
        double[] arr2 = new double[arr.length+1];
        arr2[arr2.length-1] = element;

        int i =0;
        for(double each: arr){
            arr2[i]  = each;
            i++;
        }

        return arr2;
    }
    // inserts the element to the array

    public static char[] addElement(char[] arr, char element){
        char[] arr2 = new char[arr.length+1];
        arr2[arr2.length-1] = element;

        int i =0;
        for(char each: arr){
            arr2[i]  = each;
            i++;
        }

        return arr2;
    }
    // inserts the element to the array

    public static String[] addElement(String[] arr, String element){
        String[] arr2 = new String[arr.length+1];
        arr2[arr2.length-1] = element;

        int i =0;
        for(String each: arr){
            arr2[i]  = each;
            i++;
        }

        return arr2;
    }
    // inserts the element to the array

    public static Integer[] addElement(Integer[] arr, Integer element){
        Integer[] arr2 = new Integer[arr.length+1];
        arr2[arr2.length-1] = element;

        int i =0;
        for(Integer each: arr){
            arr2[i]  = each;
            i++;
        }

        return arr2;
    }
    // inserts the element to the array

    public static Double[] addElement(Double[] arr, Double element){
        Double[] arr2 = new Double[arr.length+1];
        arr2[arr2.length-1] = element;

        int i =0;
        for(Double each: arr){
            arr2[i]  = each;
            i++;
        }

        return arr2;
    }
    // inserts the element to the array

    public static Character[] addElement(Character[] arr, Character element){
        Character[] arr2 = new Character[arr.length+1];
        arr2[arr2.length-1] = element;

        int i =0;
        for(Character each: arr){
            arr2[i]  = each;
            i++;
        }

        return arr2;
    }
    // inserts the element to the array


    public static int[]  sortDesc(int[] arr){
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    // sorts int array in descending order and returns it

    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);

        double[] arr2 = new double[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }
    // sorts double array in descending order and returns it

    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);

        char[] arr2 = new char[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }
    // sorts char array in descending order and returns it

    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }
    // sorts String array in descending order and returns it


    public static Integer[]  sortDesc(Integer[] arr){
        Arrays.sort(arr);

        Integer[] arr2 = new Integer[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    //sorts Integer array in descending order

    public static Double[]  sortDesc(Double[] arr){
        Arrays.sort(arr);

        Double[] arr2 = new Double[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    //sorts Double array in descending order

    public static Character[]  sortDesc(Character[] arr){
        Arrays.sort(arr);

        Character[] arr2 = new Character[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    //sorts Character array in descending order


    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];

        int i = 0;
        for(String each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(String each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static double[] combine2Arrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length];

        int i = 0;
        for(double each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(double each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static char[] combine2Arrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length];

        int i = 0;
        for(char each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(char each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for(Integer each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Integer each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        Double[] arr3 = new Double[arr1.length + arr2.length];

        int i = 0;
        for(Double each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Double each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
        Character[] arr3 = new Character[arr1.length + arr2.length];

        int i = 0;
        for(Character each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Character each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it
    public static void sleep(double seconds) {// sleep it by using this method.
        try {
            Thread.sleep((long)(seconds * 1000));
        }catch (InterruptedException e){

        }
        //sleep for second
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
