package day51_Exceptions.BrowserTasks;

public class OperaBrowser extends WebDriver{
    // it is a browser so iti s the child of Browser class

    public void get(String url){// bu method overridden, ayni parametreler soz konusu
        System.out.println("opening the "+url+ " in opera browser");}

    public void close(){// burda da bir overriding olusturuldu
        System.out.println("closing the opera browser browser");
    }

}
