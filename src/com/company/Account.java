package com.company;

public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account(String first, String last, double balance){
        this.first = first;
        this.last = last;
        this.balance = balance;
        acctNum = (int)(Math.random()*1000)+1;
    }
    public Account(Account account){
        this(account.first, account.last, account.balance);
    }
    public Account(){
        this(null, null, 0);
    }

    public String getLast() {
        return last;
    }
    public String getFirst() {
        return first;
    }
    public double getBalance() {
        return balance;
    }
    public int getAcctNum() {
        return acctNum;
    }

    public void setFirst(String first) {
        this.first = first;
    }
    public void setLast(String last) {
        this.last = last;
    }

    public void deposit(double moneyAdded){
        balance += moneyAdded;
    }

    public boolean withdrawal(double moneyTaken){
        if (balance < moneyTaken){
            return false;
        }
        else {
            balance -= moneyTaken;
            return true;
        }
    }
    public String toString(){
        return "Customer Name: " + first + " " + last + "\nAccount #: " + acctNum + "\nCurrent Balance: $" + balance;
    }
}
