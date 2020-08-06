package repline_tasks;

import java.util.Scanner;

public class practice2 {
/*
SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter vehicle's year:");
        short year=scan.nextShort();

        switch (year){
            case 1995:;
            case 1996:;
            case 1997:;
            case 1998:;
            case 2001:;
            case 2002:;
            case 2004:;
            case 2005:;
            case 2006:;
            case 2015:;
            case 2016:;
            case 2017:
                System.out.println("Your vehicle is needs to be recalled!");
                break;
            default:
                System.out.println("Your vehicle is fine, enjoy!");
                break;}

        }


    }

