package july01;

public class task {
    public static void main(String[] args) {
        String ta="A";
        ta=ta.concat("B");
        String tb="C";
        ta=ta+tb;
        ta.replace("C","D");
        ta=ta+tb;
        System.out.println(ta);
        String s1="abc";
        String s2="abc";
        System.out.println("s1==s2 is:"+s1==s2);//false
        System.out.println(s1==s2);//true
        boolean s=s1==s2;

        int n1=2;
        int n2=2;
        boolean n=n1==n2;


        System.out.println(s1==s2+"s1==s2 is:");
        System.out.println("====");
        System.out.println(s);
        System.out.println("s1==s2 ihohohoohs:"+s);
        System.out.println(s+" s1==s2 is:");


        System.out.println("s1==s2 is:"+s1.equalsIgnoreCase(s2));

        System.out.println("=============================+++============");
        //System.out.println("n1==n2 is:"+n1==n2);

       // System.out.println(n1==n2+"n1==n2 is:");
        System.out.println("====");
        System.out.println(n);
        System.out.println("s1==s2 is:"+n);
        System.out.println(n+" s1==s2 is:");






    }
}
