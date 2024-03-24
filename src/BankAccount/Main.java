package BankAccount;

public class Main {
    public static void main(String[] args){
        BankAccount BA1 = new BankAccount("BA1", 1000);
        BA1.deposit(200);
        System.out.println(BA1.balance());
        BA1.deposit(200);
        System.out.println(BA1.balance());

        SavingsAccount SA1 = new SavingsAccount("SA1", 200);
//        System.out.println(SA1.balance());
        SA1.deposit(300);
        SA1.withdraw(100);
        System.out.println(SA1.balance());

    }

}