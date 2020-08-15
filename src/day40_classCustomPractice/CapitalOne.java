package day40_classCustomPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Beslan=new BankAccount();
        BankAccount Ahmet=new BankAccount();
        BankAccount Viorel =new BankAccount();
        BankAccount Nurmamet=new BankAccount();
        BankAccount Waqar=new BankAccount();

        Beslan.setAccountInfo("Cheking", "Beslan", "34353432");
        Ahmet.setAccountInfo("Cheking", "Ahmet", "327543453");
        Viorel.setAccountInfo("Cheking", "Viorel", "343499232");
        Nurmamet.setAccountInfo("Cheking", "Nurmamet", "4348232523");
        Waqar.setAccountInfo("Cheking", "Wagar", "9873439232");

        ArrayList<BankAccount>accounts=new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan, Ahmet, Viorel, Nurmamet, Waqar));
        for (BankAccount each:accounts){
            each.deposit(500);
            each.getAccountInfo(); }
        //Nurmamete 1000 dolar gonderecektik ve asagidaki gibi gonderebiliriz

        accounts.get(3).deposit(10000);//para gondermek icin once get ile veraible cagrilir ve oradan da deopsit ile gonderilir
        accounts.get(3).withDraw(9000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();


        System.out.println("=======+++++++++++++++++++++======================");
        //how many people more than 1000 dolar

        // remove everybody less than 1000 dolar

        accounts.removeIf(each->each.balance<1000);

        for (BankAccount each:accounts){
            //each.deposit(500);
            each.getAccountInfo(); }

        //ne kadar kaldi
        System.out.println(accounts.size());





    }
}
