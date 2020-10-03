package day53_CustomException_Final;

import java.time.LocalDate;

public class TS_FinalVariable {

    final static String eyeColor="Brown";
    final String bloodType="A";
    // final eger static veya instance a verilirse
//mutlaka birseye initilized edilmeli
    //  final int x// final instance variable need to be initilized right away
    //  final static int y// final static  variable need to be initilized right away
    //AMA constructor olursa olur

    final int x;
    final static int y; //staic block ta boyle olur.
    static{
        y=300;
    }

    public TS_FinalVariable(int x) {
        this.x = x;
    }

    public static void main(String[] args) {


    final LocalDate dateofBirth=LocalDate.of(2000,6,3);// final olarak verilir ve dateofBirth degismez
    //if you do not wnat this varialbe not change

    //    dateofBirth=LocalDate.of(2000,6,6);// degisti ama degistmemeli

        System.out.println(dateofBirth);
        //ssn=2323423;// compile error verir

        final long ssn=1234567;// boyle yaparsak kimse degistiremez.
        System.out.println(ssn);
//bska ne degismez: pi degeri
        final double PI=3.14;// degistmez
        final boolean SunExist=true;

        final char gendre='M';

        final String birthPlace="Londan";

        final String motherName="Melahat";// bu bir local variable
        // instance variable ve static variable davar.
        String eyecolor=eyeColor+" my eye color";
        System.out.println(eyecolor);




}}
