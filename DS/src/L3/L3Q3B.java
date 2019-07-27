/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L3Q3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.print("Enter number of peg : ");
        int n=s.nextInt();
        int ans = T(n);
        System.out.printf("The answer is %d minimum movement \n",ans);
    }
    public static int T(int n){
        if (n==1||n==0)
            return 1;
        else
            return T(n-1)+2*(n-1);
    }
}