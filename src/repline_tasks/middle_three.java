package repline_tasks;

import java.util.Scanner;

/*
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */
public class middle_three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int a=word.length();
        int b=(a-1)/2-1;
        String triple= (a%2!=0 && a>=5)? word.substring(b,(b+3)): "invalid";
        System.out.println(triple);





        }
    }

