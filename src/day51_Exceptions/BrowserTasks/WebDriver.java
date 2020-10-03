package day51_Exceptions.BrowserTasks;

public class WebDriver {
    public void get(String url){
        //static method lar over rdidding olmaz.

        System.out.println("opening the "+url+ " in default browser");//bunun implamantationlari olusturuldu

    }

    public void close(){
        System.out.println("closing the browser browser");
    }

}
