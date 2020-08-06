package repline_tasks;

import java.util.Scanner;

public class gift_card {
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
                left=budget-price; lft=(int)left;
                print= (price>budget)? "Sorry, not enough funds on your gift card!":
                        "Thank you for your purchase!\nYour current balance is: "+lft+"$";
                System.out.println(print);
                break;
            case "Laptop":
                price=400;
                left=budget-price; lft=(int)left;
                print= (price>budget)? "Sorry, not enough funds on your gift card!":
                        "Thank you for your purchase!\nYour current balance is: "+lft+"$";
                System.out.println(print);
                break;
            case "Charger":
                price=15;
                left=budget-price; lft=(int)left;
                print= (price>budget)? "Sorry, not enough funds on your gift card!":
                        "Thank you for your purchase!\nYour current balance is: "+lft+"$";
                System.out.println(print);
                break;
            case "USB cable":
                price=10;
                left=budget-price; lft=(int)left;
                print= (price>budget)? "Sorry, not enough funds on your gift card!":
                        "Thank you for your purchase!\nYour current balance is: "+lft+"$";
                System.out.println(print);
                break;
            case "Headphones":
                price=30;
                left=budget-price; lft=(int)left;
                print= (price>budget)? "Sorry, not enough funds on your gift card!":
                        "Thank you for your purchase!\nYour current balance is: "+lft+"$";
                System.out.println(print);
                break;
            case "Pants":
                price=50;
                left=budget-price; lft=(int)left;
                print= (price>budget)? "Sorry, not enough funds on your gift card!":
                        "Thank you for your purchase!\nYour current balance is: "+lft+"$";
                System.out.println(print);
                break;
            case "Hat":
                price=25;
                left=budget-price; lft=(int)left;
                print= (price>budget)? "Sorry, not enough funds on your gift card!":
                        "Thank you for your purchase!\nYour current balance is: "+lft+"$";
                System.out.println(print);
                break;
            case "Socks":
                price=5;
                left=budget-price; lft=(int)left;
                print= (price>budget)? "Sorry, not enough funds on your gift card!":
                        "Thank you for your purchase!\nYour current balance is: "+lft+"$";
                System.out.println(print);
                break;
            case "Blanket":
                price=60;
                left=budget-price; lft=(int)left;
                print= (price>budget)? "Sorry, not enough funds on your gift card!":
                        "Thank you for your purchase!\nYour current balance is: "+lft+"$";
                System.out.println(print);
                break;
            case "Pillow":
                price=40;
                left=budget-price; lft=(int)left;
                print= (price>budget)? "Sorry, not enough funds on your gift card!":
                        "Thank you for your purchase!\nYour current balance is: "+lft+"$";
                System.out.println(print);
                break;
            default:
                System.out.println(input);
                System.out.println("Invalid item!");
                break;

        }








        }

    }

