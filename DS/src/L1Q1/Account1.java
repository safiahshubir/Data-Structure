/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Q1;

import java.util.Date;
import java.time.Instant;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Account1 {
    private int id = 0;
    private double balance = 0.00;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private String name;
    ArrayList transactions;
     
    public Account1(){
        
    }
    public Account1(int id,double balance){
        this.id = id;
        this.balance = balance;
        Date d = new Date();
        dateCreated = Date.from(Instant.now());
    }
    public Account1(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        Date d = new Date();
        dateCreated = Date.from(Instant.now());
        transactions = new ArrayList(5);
    }
    
    
    public int getID(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public String getName(){
        return name;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annual){
        this.annualInterestRate = annual/100;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        balance = balance - amount;
        Transaction W =  new Transaction('W',amount,this.balance,"WITHDRAW");
        
        transactions.add(W.date);
        transactions.add(W.type);
        transactions.add(W.amount);
        transactions.add(W.balance);
        transactions.add(W.description);
        
    }
    public void deposit(double amount){
        balance = balance + amount;
        Transaction D = new Transaction('D',amount, this.balance, "DEPOSIT");
        
        transactions.add(D.date);
        transactions.add(D.type);
        transactions.add(D.amount);
        transactions.add(D.balance);
        transactions.add(D.description);
    }
    public void displayTransactions(){
        int count = 0;
        for(Object x : transactions){
            System.out.println(x);
        }
    }
}