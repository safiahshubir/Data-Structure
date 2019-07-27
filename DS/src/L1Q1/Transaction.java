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
public class Transaction {
     static Date date;
    char type;
    double amount;
    double balance; 
    String description;
    
    public Transaction(char type, double amount, double balance, String description){
        date = Date.from(Instant.now());
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    public Date getDate(){
        return date;
    }
    public char getType(){
        return type;
    }
    
    
    
}
