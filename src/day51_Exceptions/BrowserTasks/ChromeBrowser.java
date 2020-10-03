package day51_Exceptions.BrowserTasks;

public class ChromeBrowser extends WebDriver {
    /* get ve close olacak

     */

    public void get(String url){// bu method overridden, ayni parametreler soz konusu
        System.out.println("opening the "+url+ " in chrome browser");}

    public void close(){// burda da bir overriding olusturuldu
        System.out.println("closing the chrome browser browser");
    }

}
