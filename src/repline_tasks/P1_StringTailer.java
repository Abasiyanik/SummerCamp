package repline_tasks;

//import org.w3c.dom.ls.LSOutput;

//import org.w3c.dom.ls.LSOutput;
//

public class P1_StringTailer {
    public static void main(String[] args) {
//AIM: this is a prep for the tailer of Googlde resach. 

        String result = "About 4,680,000,000 results (0.83 seconds)";
        int a = result.indexOf("About");
        int b = result.indexOf("results");
        System.out.println(a+" "+b);
        System.out.println(result.substring(6,result.indexOf("results")-1));
        //System.out.println("ana");
    }
}
