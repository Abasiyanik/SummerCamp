package day41_Static;

public class Carpet {


        /*
        1. create a custom class for the Carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        getCarpetInfo(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets

         */
        /*
        instance variables are created so each objects can be unique. each object its own coppy.
        //inside method da olursa bu artik local veraible olur ama biz class icinde ve method disinda ceclare edersek
        // yani outside the method global yani instance variables olustururuz
        // local veraibles outside method kullanilabmazlar. ama instance variables kullanilabilir
        // lnstance variable ise inside veya outside the method kullanilabilir.
        // instance veraiables ayrica attributes of the class dir.
        */


            double width;
            double length;
            double unitPrice;
            boolean isPersian;

            //instance method olurturalim. instance methodlarda objectte aittir ve farkli bir sonuc alir. execute their own actions
            //
            // ilk instance method :costumOder() method to set the objects' features.

            public void customOrder(double width, double length, double unitPrice, boolean isPersian)  {// parameter gerekir ve
                // ne kadar data isteniyorsa o kadar parameters konulmalidir. paratmers are local variables declared in the method and they
                // can share the same name if so we have to use this keyword..
                this.width = width;
                this.length = length;
                this.unitPrice = unitPrice;
                this.isPersian = isPersian;
                //this. : for ibject intances ONLY when the instance and local parameters are the same names.
            }

            /* cost methodun hesaplayalim.
            mesela 3 farkli carpet olsa
            carpet1
            carpet2
            carpet3
            biz methodun birinci carpeti cagirsak sadece

             */
            public double calcCost() {// we did not declare any local variables with the same name of the instance variables
                // so we do not need to use this. keyword BUT  we can use this mesela
                //  totalPrice=(this.isPersian)? (this.width*this.length)*this.unitPrice+200:(this.width*this.length)*this.unitPrice+200;
                //  STILL WE CAN USE IT BUT IT IS EXTRA STEP
                //  .

            double totalPrice=0;
            totalPrice=(isPersian)? (width*length)*unitPrice+200:(width*length)*unitPrice;

            return totalPrice;}
            // ne return edersen et method da declared edlien methodla ayni olmalidir
                // burada (int) yazarak double int e donusturuldu ve sistem mutlu oldu.
                // .


             public void getCarpetInfo(){
                 System.out.println("===============================");
                 System.out.println("Width: "+width);// this.width de kullanilablir ama gerek yok
                 System.out.println("Length "+ length);
                 System.out.println("Unit Price: "+unitPrice);
                 System.out.println("Total Price: "+calcCost());// burada calcCost() methoduyla variable cagrildi. yoksa bu variable instance variable degil
                 System.out.println(" PErsian Carpet: "+isPersian);
                 System.out.println("===============================");


             }


        }




