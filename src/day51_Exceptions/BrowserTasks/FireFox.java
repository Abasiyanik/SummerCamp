package day51_Exceptions.BrowserTasks;

public class FireFox extends WebDriver{

    public void get(String url){// bu method overridden, ayni parametreler soz konusu
        System.out.println("opening the "+url+ " in firefox browser");}

    public void close(){// burda da bir overriding olusturuldu
        System.out.println("closing the firefox browser browser");
    }
}
