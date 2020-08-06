package repline_tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class firstchar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        int a=word.length();

        String ana="";

        if (a%2==0) {
            ana= (a>=4)? word.substring(a/2-1,a/2+1): word+word;}

                    else { ana= (a>3)? word.substring((a-1)/2,(a+1)/2): word+word+word;
        }

        System.out.println(ana);

        }
    }


