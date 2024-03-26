package BankAccount2;

public class BankAccount2 {
    private String accountNumber;
    private double balance;

    public BankAccount2(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        System.out.println("Deposit some amount in your account ");
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Insufficient amount");
        }
    }

    public double balance(){
        return balance;
    }

}
