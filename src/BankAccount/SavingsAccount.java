package BankAccount;

import BankAccount.BankAccount;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    public void deposit(double amount){
        super.deposit(amount);
    }

    public void withdraw(double amount){
        if(balance() - amount < 100){
            System.out.println("Cannot withdraw balance must be at least 100 shillings");
        }else{
           super.withdraw(amount);
        }
    }
}
