package day26_7_14;

import java.util.Arrays;

public class MultiDArray_Practice1 {
    /*
    tester:{"Lillia", "Odina", "Cristina", "Elkem"}
    Dev: {"Ahmet", "Erfan", "Roza", "Sarah"}
    SM:{"Nurmamaet"}
    PO:{"Nadir"}
    BA:{"Alex"}

    scrumTeam: testers, developers, SM. PO. BA// 2D ARRAY
     */
    public static void main(String[] args) {

        String [] testers={"Lillia", "Odina", "Cristina", "Elkem"};
        String [] developers={"Ahmet", "Erfan", "Roza", "Sarah"};
        String [] SM ={"Nurmamaet"};
        String [] PO= {"Nadir"};
        String [] BA={"Alex"};

        String [][] scrumTeam={testers, developers, SM, PO, BA};
        System.out.println(Arrays.deepToString(scrumTeam));


        scrumTeam[4][0]="Fatih";// Alex in yerine Fatihi ekledim

        scrumTeam[1][2]="Emine";
        scrumTeam[2][0]= "Semih";

        //         how can we replace the entire arrays
        String [] testers2= {"Irene", "Aslan", "Nazar"};

        scrumTeam[0]= testers2;// yeni testerlar ile degisti

        for (String [] each:scrumTeam){

            for (String name:each) {


                System.out.println(name);//tum bireyleri yazar

            }
        }



        System.out.println(Arrays.deepToString(scrumTeam));


        System.out.println("========================");
        int[][] scores={{10,20,30}, {60,55,75,105}, {93, 48,125,135}};

        for (int [] each1DArray:scores){
          //  System.out.println(Arrays.toString(each1DArray));

            for (int eachElement: each1DArray){

               // System.out.print(eachElement);

                if (eachElement%3==0 || eachElement %5==0){

                   // System.out.println();
                    System.out.println(eachElement+"");

                }
                continue;



            }


        }


    }}





