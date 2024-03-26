package BankAccount2;

import BankAccount.BankAccount;

public class SavingsAccount2 extends BankAccount {
    public SavingsAccount2(String accountNumber, double balance){
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
