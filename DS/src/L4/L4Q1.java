/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4;

/**
 *
 * @author user
 */
public class L4Q1 {


    public static void main(String[] args) {
        
        StorePairGeneric a = new StorePairGeneric(6,4); 
        StorePairGeneric b = new StorePairGeneric(2,2);
        StorePairGeneric c = new StorePairGeneric(6,3);
        
        System.out.println(a.compareTo(a));
        System.out.println(a.equals(a));
        System.out.println("");
        System.out.println(b.compareTo(b));
        System.out.println(b.equals(b));
        System.out.println("");
        System.out.println(c.compareTo(c));
        System.out.println(c.equals(c));
        System.out.println("");
    }
    
     
}