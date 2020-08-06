package july01;

public class boolean_string {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        boolean c=s1==s2;
        boolean d=("a"+s1)==("a"+s2);
        String s3=" "+s1;
        String s4=" "+s2;

        int n1=3;
        int n2=3;
        boolean cc=3+n1==n2+3;
        System.out.println("cc: "+cc);//true
        System.out.println("==++");
        System.out.println(("ana"+s1)==("ana"+s2));//false


        //String s3=String
        System.out.println("bu dogrudur"+(s1==s2));//ture
        System.out.println("bu nah dogrudur"+s1==s2);// false cunku "" s1 ile s2 karsilastiriliyor
        System.out.println(""+s1==""+s2);//false too
        System.out.println(c+" "+d);//true and false
        System.out.println(s3==s4);//false
        System.out.println(s3.endsWith(s4));//true

    }
}
