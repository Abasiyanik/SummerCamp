package repline_tasks;

import java.util.Scanner;

public class gift_card2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String input=scan.nextLine();
        double budget=100;
        double price=0;
        double left=0;
        int lft=0;
        String choice="";
        String print="";


        switch (input) {

            case "Smartphone":
                price=300;

                break;
            case "Laptop":
                price=400;

                break;
            case "Charger":
                price=15;

                break;
            case "USB cable":
                price=10;

                break;
            case "Headphones":
                price=30;

                break;
            case "Pants":
                price=50;

                break;
            case "Hat":
                price=25;

                break;
            case "Socks":
                price=5;

                break;
            case "Blanket":
                price=60;

                break;
            case "Pillow":
                price=40;

                break;
            default:

                break;

        }
        left=budget-price;
        lft=(int)left;

        print= (price>0&&price>budget)? "Sorry, not enough funds on your gift card!": (price>0&&price<budget)?
                "Thank you for your purchase!\nYour current balance is: "+lft+"$":"Invalid item!" ;
        System.out.println(print);






        }

    }

