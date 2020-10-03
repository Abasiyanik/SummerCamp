package day48_Inheritance;

public class BOfA {

    public static void main(String[] args) {
        BankAccount obj= new BankAccount("Ramazan", "Alic");

        obj.setAccountHolder(obj.firstName+" "+obj.lastName);
        obj.setAccountNumber(234522553);
        obj.setBalance(50);

        obj.availableBalance();
        obj.depost(500);
        obj.availableBalance();
        obj.withdraw(700);
        obj.withdraw(-50);
        obj.withdraw(0);

        obj.withdraw(300);
        obj.availableBalance();

        System.out.println(obj);


    }
}
