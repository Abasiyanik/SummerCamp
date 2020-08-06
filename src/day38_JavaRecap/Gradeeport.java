package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class Gradeeport {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(100,90,56, 67, 56, 45, 89, 76, 77, 67, 87, 64,56,99,87,66,93, 20, 10, 5));//addAll is a bulk operation
        //ArrayasList is dynamic ve istedigimiz kadar ekleriz
        // arraylist is a class ve print etmek icin normal olarak print kullanilir
        System.out.println(list);// list.Arrays.toString de kullanilabilir.
        //array lar icin ise Arrays.toString gereklidir zira arraylar farklidir ve util den array cagirmak gerekir
        // know we need to put gradeA to gradeA ye


        ArrayList<Integer>gradeA=new ArrayList<>();

        gradeA.addAll(list);//addAll icinde
        gradeA.removeIf (each->each <90);//remove the grades that are not A //each represrents all the numbers
        // only retain the grades of A


        System.out.println("Grade A: "+gradeA);
        ArrayList<Integer>gradeB=new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf (p-> p<80 || p>89);//remove the grades that are less than 80 and greater than 89

        System.out.println("Grade B: "+gradeB);

        ArrayList<Integer>gradeC=new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf (p-> p<70 || p>79);//remove the grades that are less than 70 and greater than 89
        System.out.println("Grade C: "+gradeC);


        ArrayList<Integer>gradeD=new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf (p-> p<60 || p>69);//remove the grades that are less than 70 and greater than 89
        System.out.println("Grade D: "+gradeD);


        ArrayList<Integer>gradeF=new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeAll(gradeA);// remove gradeA
        gradeF.removeAll(gradeB);//remove gradeB
        gradeF.removeAll(gradeC);//remove gradeC
        gradeF.removeAll(gradeD);//remove gradeD

        //gradeF.removeIf (p->  p>59);//remove the grades that are greater than 59
        System.out.println("Grade F: "+gradeF);
        System.out.println("=====================================");

        System.out.println(gradeA.size()+ " students made A");
        System.out.println(gradeB.size()+ " students made B");
        System.out.println(gradeC.size()+ " students made C");
        System.out.println(gradeD.size()+ " students made D");
        System.out.println(gradeF.size()+ " students failed");

    }
}
