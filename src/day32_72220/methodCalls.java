package day32_72220;

import Library.Util;

import java.util.Arrays;
//import org.w3c.dom.ls.LSOutput;

public class methodCalls {
    public static void main(String[] args) {


    String firstName="adfrr";
    String lastName="fgsderER";
    String fullname= Util.formatFullName(firstName,lastName);// kullanilan method

        System.out.println(fullname);
        //task : what is the unite letter in the name
        System.out.println(Util.uniques(fullname.toLowerCase()));

        //repline_tasks.reverse it
        System.out.println(Util.reverse(fullname));

        // hadi arraya bir numara ekleyek
        int [] classScores={12,23,34, 67, 78, 78};
        int scoreOfAhmed=56;

        classScores= Util.addElement(classScores,scoreOfAhmed);

        System.out.println(Arrays.toString(classScores));




    }


}
