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
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println(F(4,10));
        System.out.println(F(12,8));
        System.out.println(F(7,12));
    }
    
    public static long F(int n, int r){
        /*
          n : number of basket
          r : number of items
        */
        if(n == 1) return 1;  //when number of basket is 1 then the number of pattern is one
        else if(r == 1) return n;  //when number of item is 1 then there is only one possible pattern
        return F(n-1,r)+F(n,r-1);
}
    
}