package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount("Aman",10000,2000);
        bankAccount.deposit(1000);
        SavingsAccount savingsAccount = new SavingsAccount("Aman",12000,5000,1.2);
        savingsAccount.withdraw(6000);
        //bankAccount.generateAccountNumber(8,20);
    }
}