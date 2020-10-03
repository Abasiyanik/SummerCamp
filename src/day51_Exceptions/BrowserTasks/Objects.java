package day51_Exceptions.BrowserTasks;

import day51_Exceptions.BrowserTasks.ChromeBrowser;

public class Objects {
    public static void main(String[] args) {

        ChromeBrowser chrome1=new ChromeBrowser();
        chrome1.get("http://www.google.com");// iki implamantation var
        chrome1.close();


        FireFox firefox1=new FireFox();//yeni bir firefox object acilir
        firefox1.get("http://www.firefox.com");// ikinci implamantation olusturulur
        firefox1.close();// ikinci implamantation kapatilir


        OperaBrowser opera1=new OperaBrowser();
        opera1.get("http://www.opera.com");
        opera1.close();



    }

}
