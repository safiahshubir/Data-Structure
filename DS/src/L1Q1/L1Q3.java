/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Q1;

import java.text.SimpleDateFormat;

/**
 *
 * @author user
 */
public class L1Q3 {
    public static void main(String[] args) {
         SimpleDateFormat sd = new SimpleDateFormat("EEEE dd/MM/yyyy hh:mm a");
        Account acc = new Account(1122,20000);
        
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        
        System.out.println("Balance");
        System.out.printf("$%.2f\n\n",acc.getBalance());
        System.out.println("Monthly Interest");
        System.out.printf("$%.2f\n\n",acc.getMonthlyInterest());
        System.out.println("Date Created");       
        System.out.println(sd.format(acc.getDateCreated()));
    }
    
}


