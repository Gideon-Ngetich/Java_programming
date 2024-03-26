package BankAccount2;

import BankAccount.BankAccount;

public class Main {
    public static void main(String[] args){
        BankAccount BA1 = new BankAccount("BA1", 1000);
        BA1.deposit(200);
        System.out.println(BA1.balance());
        BA1.deposit(200);
        System.out.println(BA1.balance());

        SavingsAccount2 SA1 = new SavingsAccount2("SA1", 200);
//        System.out.println(SA1.balance());
        SA1.deposit(300);
        SA1.withdraw(100);
        System.out.println(SA1.balance());

    }

}