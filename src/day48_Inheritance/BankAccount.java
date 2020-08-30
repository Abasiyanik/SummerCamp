package day48_Inheritance;
/*
 create costum class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            action:
                    deposit
                    withdraw
                    availableBalance


 */

public class BankAccount {
    public String firstName;
    public String lastName;

    public BankAccount (String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    //bankName="Bank of America"; bu da olur ama 100 tane object varsa herdefasinda calsirir
        // ve memoride yer kaplar bu yuzden static veriler sadece static block icinde yer almasi daha uygundur'

    }


     public static String bankName;
    static{bankName="Bank of America"; }// static bir kere execution olur ve her defasinda ilk defa olur
    // istersek bankAmericayi constructor icinde de koyabilir


//lets list all private data
    private String accountHolder;
    private long accountNumber;
    private double balance;


//lets prepatre getters

    public String getAccountHolder() {
        return accountHolder;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

//lets preapre setters


    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // initials
    public String initials (){
        return ""+firstName.substring(0,1).toUpperCase()+lastName.substring(0,1).toUpperCase();

    }


    public void depost (double amount){
        System.out.println("Depositing: "+amount);
        balance+=amount;
    }

    public void withdraw (double amount) {
        if (amount <= 0) {
            System.out.println("invalid amount");
            return;
        }
        if (amount>balance){
            System.out.println("Sorry, not enough balance");
            return;

        } else {

            System.out.println("Withdrawing amount: $"+amount);
            balance-=amount;
        }

    }

    public void availableBalance(){
        System.out.println("Available Balance: "+getBalance());
    }

    public String toString(){
        return bankName +
                "\n==================================================="+
                "\n"+firstName + " " + lastName +
                "\nAccount Number: "+getAccountNumber()+
                "\n==================================================="+
                "\nBalance: $"+getBalance();
    }

}
