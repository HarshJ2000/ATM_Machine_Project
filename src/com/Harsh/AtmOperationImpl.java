package com.Harsh;

public class AtmOperationImpl implements AtmOperationInterf{
    ATM atm = new ATM();
    @Override
    public void viewBalance() {
        System.out.println("Available balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (atm.getBalance() >= withdrawAmount) {
            System.out.println("Collect The Cash "+withdrawAmount);
            atm.setBalance(atm.getBalance()-withdrawAmount);
            viewBalance();
        }else{
            System.out.println("Insufficient Balance!!!");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount+"Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {

    }
}
