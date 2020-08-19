package day43_static;

       // import static Library.Resources.a;

import static Library.Resources.aa;
import static Library.Resources.*;
import java.util.Arrays;

public class test {
    //StaticBlcok3 e refere
    public static void main(String[] args) {
        System.out.println(StaticBlock3.a);//0
        System.out.println(StaticBlock3.b);//0
        System.out.println(StaticBlock3.c);//0
        // ilk ucunde degerler main icinde girildigi icin burada kullanamadik
        System.out.println(StaticBlock3.d);//1
        System.out.println(StaticBlock3.e);//2
        System.out.println(StaticBlock3.f);//3
        // buradaki degerler static{} inicnde class sonrasinda ve main oncesinde girdigi icin seve seve kullanabiliyoru

        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);
        Library.Resources.method1();
        //System.out.println(aa);

    }
}
