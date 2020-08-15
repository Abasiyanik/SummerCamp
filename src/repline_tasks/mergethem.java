package repline_tasks;

import javax.swing.*;
import java.util.Arrays;

public class mergethem {
    public static void main(String[] args) {
        String aba="123";
        String baba="abcdef";
        String h=mergeStrings(aba, baba );
        System.out.println(h);
      //  Arrays.toString(h)
    }
    public static String mergeStrings(String one, String two) {
        String st=""; String ln="";
        int shrt=0;
        int lng=0;

        if (one.length()<=two.length()){
            shrt=one.length() ; lng=two.length(); ln=two;
        } else {shrt=two.length(); lng=one.length(); ln=one;}

        char oneC[] = st.toCharArray();
        char twoC[] = ln.toCharArray();

        int t=0;
       //t=oneC.length+twoC.length;
        String h="";
        //int s = (oneC.length <= twoC.length)? oneC.length : twoC.length;
        //char hg[]=new char[t];
        int i=0;
        int j=0;
        while (i <  shrt) {
            h +=""+one.substring(i,i+1)+ two.substring(i,i+1);
          //  j++;
            i++;
        }
        h=h+ln.substring(i++);

        return h;
    }
}
