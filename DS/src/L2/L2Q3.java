/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2;

/**
 *
 * @author user
 */
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println(exponent(10,3));
    }
    private static long exponent(int x, int y){       
        if(y==1) return x;        
        return x*(exponent(x,y-1));
        //return exponent(x*((int)Math.pow(x,(double)1/(-y+4))),y-1);
    }
}