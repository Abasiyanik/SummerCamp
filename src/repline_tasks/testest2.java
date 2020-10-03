package repline_tasks;

public class testest2 {

    public static void main(String[] args) {
        int a=450;
        double b=3.4;
        double c;
        c=a;
        long y;
        y=a;

        float k=34353.34F;
        c=k;

        short g;
        g=343;
        byte df=12;
        g=df;
        df=(byte)a;
        System.out.println("hoho\n lo\t\\\t\t\t \'kana\' \"ali\"");

        System.out.println(c);
        System.out.println(y);
        System.out.println(a);
        System.out.println("ali"+3);
        System.out.println("ali"+3+4);
        System.out.println(3+"ali");
        System.out.println(4+3+"ali");//7ali
        System.out.println('m'+3);//112
        System.out.println('m');//m
        System.out.println('m'+'n');//219
        System.out.println(""+'m'+'n');//mn

        System.out.println(df);//-62
        System.out.println(a);//450
        System.out.println(a++);//450
        System.out.println(a);//451
        System.out.println(++a);//452
        System.out.println(a);//452
        System.out.println(--a);//451
        System.out.println(a--);//451
        System.out.println(a);//450
        String ana=new String("anam");
        String baba=new String();
        baba=ana;
        System.out.println(baba);//anam
        ana="anam1";
        System.out.println(baba);//anam


    }
}
