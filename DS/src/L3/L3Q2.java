/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3;

/**
 *
 * @author user
 */
public class L3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       binom(3,0);
    }
    
    public static int binomial(int n, int k){
        if(k == n||k == 0) return 1;
        return binomial(n-1,k-1)+binomial(n-1,k);
        
    }
    public static void binom(int n,int k){      
        if(k < n){            
            System.out.print(binomial(n,k)+"x^"+(n-k)+"y^"+k+" + ");
            binom(n,k+1);
            
        }
        else if (k==n){
            System.out.println(binomial(n,k)+"x^"+(n-k)+"y^"+k);
        }   
    }
}