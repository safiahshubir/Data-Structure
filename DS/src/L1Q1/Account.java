/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Q1;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author user
 */
public class Account {
  private int id = 0;
    private double balance = 0.00;
    private double annualInterestRate = 0;
    private Date dateCreated;
    double monthlyInRate;
    double monthlyInterest;
     
    public Account(){
        
    }
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        Date d = new Date();
        dateCreated = Date.from(Instant.now());
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
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    
}