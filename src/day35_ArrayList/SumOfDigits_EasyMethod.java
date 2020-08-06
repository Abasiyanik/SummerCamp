package day35_ArrayList;

public class SumOfDigits_EasyMethod {
    public static void main(String[] args) {
        String str="a1b2c3fg5k34l23kity43";
        int sum=0;
        for (char each:str.toCharArray()){
          if (Character.isDigit(each)){// ASCII ezberlemeye gerek yok direkt olarak

           // if (each>=48 && each<=57){
                sum +=Integer.parseInt(""+each);
            }


        }
        System.out.println(sum);

    }
}
