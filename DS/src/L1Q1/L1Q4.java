/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Q1;

/**
 *
 * @author user
 */
public class L1Q4 {
    
    public static void main(String[] args) {
        
        Account1 acc = new Account1("George",1122,1000);
        
        acc.setAnnualInterestRate(1.5);
        
        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);
        
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);
        
        System.out.println("Name : "+acc.getName());
        System.out.printf("Interest Rate : %.3f%%\n",acc.getAnnualInterestRate());
        System.out.printf("Balance : %.2f\n\n",acc.getBalance());
        System.out.println("Transactions\n");
        acc.displayTransactions();
    }
    
}